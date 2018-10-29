package com.asif.viewmodel;

public class ChannelInfo {
	private String id;
	private String name;
	private String displayName;
	private String status;
	private String url;
	private String updatedTime;
	private String language;
	private String creationTime;
	
	public ChannelInfo(String id, String name, String displayName, String status,
			String url, String updatedTime, String language, String creationTime) {
		super();
		this.id = id;
		this.name = name;
		this.displayName = displayName;
		this.status = status;
		this.url = url;
		this.updatedTime = updatedTime;
		this.language = language;
		this.creationTime = creationTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
	
	

}
