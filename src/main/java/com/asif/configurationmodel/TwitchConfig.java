package com.asif.configurationmodel;

public class TwitchConfig {
	private String clientid;
	private String userUrl;
	private String channelUrl;
	private String streamUrl;
	
	public TwitchConfig(String clientid, String userUrl, String channelUrl,
			String streamUrl) {
		super();
		this.clientid = clientid;
		this.userUrl = userUrl;
		this.channelUrl = channelUrl;
		this.streamUrl = streamUrl;
	}
	public String getClientid() {
		return clientid;
	}
	public void setClientid(String clientid) {
		this.clientid = clientid;
	}
	public String getUserUrl() {
		return userUrl;
	}
	public void setUserUrl(String userUrl) {
		this.userUrl = userUrl;
	}
	public String getChannelUrl() {
		return channelUrl;
	}
	public void setChannelUrl(String channelUrl) {
		this.channelUrl = channelUrl;
	}
	public String getStreamUrl() {
		return streamUrl;
	}
	public void setStreamUrl(String streamUrl) {
		this.streamUrl = streamUrl;
	}
}
