package com.pda.mobile.model.controllers;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Logger;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import com.pda.mobile.kafka.message.AlarmInfor;
import com.pda.mobile.kafka.message.MemoryInfo;
import com.pda.mobile.logs.LogTools;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@Controller
@CrossOrigin(origins = "*")
@SecurityRequirement(name = "bearerAuth")
@RequestMapping("/api/sse")
public class PcccSseController {

	private final CopyOnWriteArrayList<SseEmitter> emitters = new CopyOnWriteArrayList<>();
	public static ConcurrentHashMap<String, SseEmitter> connMap = new ConcurrentHashMap<String, SseEmitter>();
	private static final Logger log = Logger.getLogger(PcccSseController.class.getName());

	@GetMapping("/memory")
	public SseEmitter handle(HttpServletRequest request, HttpServletResponse response) {
		SseEmitter emitter = new SseEmitter();

		this.emitters.add(emitter);
		emitter.onCompletion(() -> this.emitters.remove(emitter));
		emitter.onTimeout(() -> this.emitters.remove(emitter));
		// Debug.
		log.info("Has new connection: time out = " + emitter.getTimeout() + " IP=" + request.getRemoteAddr() + " host= "
				+ request.getRemoteHost());
		return emitter;
	}

	@RequestMapping(value="/channelManage", method = RequestMethod.GET )
	public SseEmitter manageChannel(@RequestParam(name = "userId", required = true, defaultValue = "0") String userId,
			@RequestParam(name = "device", required = true, defaultValue = "0") String device,
			@RequestParam(name = "appName", required = true, defaultValue = "0") String appName) 
	{
		SseEmitter emitter = new SseEmitter(-1L);
		this.connMap.put(userId, emitter);
		emitter.onCompletion(() -> this.connMap.remove(emitter));
		emitter.onTimeout(() -> {
			emitter.complete();
			this.connMap.remove(emitter);}
		);
		log.info("Connection is establish, userid ={" + userId + "}"); 
		return emitter;
	}

	@EventListener
	public void onMemoryInfo(MemoryInfo memoryInfo) {

		SseEmitter emitter = connMap.get(memoryInfo.getConnectionKey());
		try
		{
			if (null == emitter)
			{
				log.warn("The client which have connection key:" + memoryInfo.getConnectionKey() + " aren't connect to server.");
			}
			else
			{
				emitter.send(memoryInfo);
			}
		}
		catch (IOException ex)
		{
			log.error("Error when send data {" + LogTools.convertObjectToString(memoryInfo) + " to: " + memoryInfo.getConnectionKey());
			connMap.remove(memoryInfo.getConnectionKey());
		}
	}

	@EventListener
	public void onAlarmInfor(AlarmInfor alarmInfor) {
		
		if (alarmInfor.getIdOwnerBuilding() == null)
		{
			log.error("Error: Data invalid - IdOwnerBuilding must not null.");
			log.error("Error: " + LogTools.convertObjectToString(alarmInfor));
		}
		else
		{
			SseEmitter emitter = connMap.get(alarmInfor.getIdOwnerBuilding());
			try
			{
				if (null == emitter)
				{
					log.info("User Of building : { builidId = " + alarmInfor.getIdBuilding() + ", acountId = " + alarmInfor.getIdOwnerBuilding() + "} is not connect." );
				}
				else
				{
					emitter.send(alarmInfor);
					log.info("Data send:" + LogTools.convertObjectToString(alarmInfor));
				}
			}
			catch (IOException ex)
			{
				log.error("Error when send data {" + LogTools.convertObjectToString(alarmInfor) + " to: " + alarmInfor.getIdOwnerBuilding());
				ex.printStackTrace();
				connMap.remove(alarmInfor.getIdOwnerBuilding());
			}
		}	
	}
}
