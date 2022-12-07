package com.pda.mobile.kafka.message;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FBMessage {
	private String title;
	private String content;
	private Map<String,String> data = new ConcurrentHashMap<String, String>();
	private String userId;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Map<String, String> getData() {
		return data;
	}
	public void setData(Map<String, String> data) {
		this.data = data;
	}
	
}
