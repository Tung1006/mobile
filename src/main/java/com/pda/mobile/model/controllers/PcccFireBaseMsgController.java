package com.pda.mobile.model.controllers;

import java.util.Date;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.google.firebase.messaging.*;
import com.pda.mobile.beans.ResponseBean;
import com.pda.mobile.model.entities.PcccCSCTMobileAccess;
import com.pda.mobile.kafka.message.FBMessage;
import com.pda.mobile.logs.LogTools;
import com.pda.mobile.model.services.PcccCSCTFMHistoryService;
import com.pda.mobile.model.services.PcccCSCTMobileAccessService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/api/firebase")
@SecurityRequirement(name = "bearerAuth")
public class PcccFireBaseMsgController {
	
	@Autowired
	public PcccCSCTMobileAccessService mobileService;
	@Autowired
	public PcccCSCTFMHistoryService historyService;
	@Autowired
	public Environment env;
	@Autowired
	FirebaseMessaging firebaseMessage; 
	private static final Logger log = Logger.getLogger(PcccFireBaseMsgController.class.getName());

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseBean regFmService(@RequestParam(name = "userName", required = true) String userName,
			@RequestParam(name = "userId", required = true) String userId,
			@RequestParam(name = "accessToken", required = true) String accessToken,
			@RequestParam(name = "uuid", required = true) String uuid,
			@RequestParam(name = "bundleId", required = true) String bundleId,
			@RequestParam(name = "tokenId", required = true) String tokenId,
			@RequestParam(name = "deviceToken", required = true) String deviceToken,
			@RequestParam(name = "os", required = true) String osName,
			@RequestParam(name = "modelName", required = true) String modelName,
			@RequestParam(name = "brandName", required = true) String brandName)
	{
		ResponseBean response = new ResponseBean();
		PcccCSCTMobileAccess mobileObj = mobileService.getUserByUUID(uuid);
		if (null == mobileObj)
		{
			mobileObj = new PcccCSCTMobileAccess();
		}
		else
		{
			
		}
		
		if (!(userName.equals("") || userName == null)) mobileObj.setUsername(userName);
		if (!(userId.equals("") || userId == null)) mobileObj.setUserId(userId);
		if (!(accessToken.equals("") || accessToken == null)) mobileObj.setAccessToken(accessToken);
		if (!(bundleId.equals("") || bundleId == null)) mobileObj.setBundleId(bundleId);
		if (!(tokenId.equals("") || tokenId == null)) mobileObj.setTokenId(tokenId);
		if (!(deviceToken.equals("") || deviceToken == null)) mobileObj.setDeviceToken(deviceToken);
		if (!(osName.equals("") || osName == null)) mobileObj.setOsName(osName);
		if (!(modelName.equals("") || modelName == null)) mobileObj.setModelName(modelName);
		if (!(brandName.equals("") || brandName == null)) mobileObj.setBrandName(brandName);	
		if (!(uuid.equals("") || uuid == null)) mobileObj.setUuidDevice(uuid);
		try
		{
			mobileObj.setRegisterDate(new Date(System.currentTimeMillis()));
			response.setData(mobileService.register(mobileObj));
			log.info("FCM Register data: " + LogTools.convertObjectToString(mobileObj));
		}
		catch (Exception e)
		{
			log.error(e);
			response.setMessage(e.getMessage());
			response.setStatus(500);
		}
		return response;
	}
	@EventListener
	public void onFBMessage(FBMessage obj)
	{
		// Send messsage to firebase

			List<PcccCSCTMobileAccess> listSend = mobileService.getUserById(obj.getUserId());
			
			for (PcccCSCTMobileAccess pcccCSCTMobileAccess : listSend) 		
			{
				try
				{
					String deviceToken =pcccCSCTMobileAccess.getDeviceToken();
	
			        Notification notification = Notification
			                .builder()
			                .setTitle(obj.getTitle())
			                .setBody(obj.getContent())
			                .build();
			        Message message = Message.builder()
			        		.setToken(deviceToken)
			        		.setNotification(notification)
			        		.putAllData(obj.getData())
			        		.build();
			        log.info("Start sending ...");
			        String result = firebaseMessage.send(message);
			        log.info("Result FCM: " + result);
				} 
				catch (Exception e)
				{
					log.error(e.getMessage());
					log.error(e.getStackTrace());
				}		        
			}
	}
	@RequestMapping(value = "/testfmc", method = RequestMethod.POST)
	public ResponseBean testFMC(@RequestParam(name = "title", required = true) String title,
			@RequestParam(name = "content", required = true) String content,
			@RequestParam(name = "tokenDevice", required = true) String tokenDevice)
	{
		ResponseBean response = new ResponseBean();
		try
		{
	        Notification notification = Notification
	                .builder()
	                .setTitle(title)
	                .setBody(content)
	                .build();
	        Message message = Message.builder()
	        		.setToken(tokenDevice)
	        		.setNotification(notification)
	        		.build();
	        log.info("Start sending ...");
	        String result = firebaseMessage.send(message);
	        log.info("Result FCM: " + result);		}
		catch (FirebaseMessagingException e)
		{
			log.error("Error Message: " + e.getMessage() + "| ErrorCode: " + e.getErrorCode());
			response.setErrCode("FCM-ERR-01");
			response.setStatus(HttpStatus.NOT_FOUND.value());
		}
		return response;
	}
	@RequestMapping(value = "/refreshToken", method = RequestMethod.POST)
	public ResponseBean refreshToken(@RequestParam(name = "userName", required = true) String userName,
	@RequestParam(name = "userId", required = true) String userId,
	@RequestParam(name = "tokenId", required = true) String tokenId,	
	@RequestParam(name = "deviceToken", required = true) String deviceToken,	
	@RequestParam(name = "uuid", required = true) String uuid)
	{
		ResponseBean response = new ResponseBean();
		PcccCSCTMobileAccess object = mobileService.getUserByUUID(uuid);
		if (object == null)
		{
			response.setErrCode("ERR-01403");
			response.setMessage("No data found. User did not registed.");
			response.setStatus(HttpStatus.NOT_FOUND.value());
		}
		else
		{
			if (!(userName.equals("") || userName == null)) object.setUsername(userName);
			if (!(userId.equals("") || userId == null)) object.setUserId(userId);
			if (!(tokenId.equals("") || tokenId == null)) object.setTokenId(tokenId);
			if (!(deviceToken.equals("") || deviceToken == null)) object.setDeviceToken(deviceToken);
			object.setRefreshDate(new Date(System.currentTimeMillis()));
			response.setData(mobileService.updateRegInfor(object));
			log.info("FCM Refresh Token data: " + LogTools.convertObjectToString(object));
		}
		return response;
	}
	
}
