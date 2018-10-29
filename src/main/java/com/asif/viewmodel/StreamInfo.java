package com.asif.viewmodel;

public class StreamInfo {
	private String id;
	private String game;
	private String viewers;
	private String creationTime;
	private String fps;
	
	public StreamInfo(String id, String game, String viewers, String creationTime,
			String fps) {
		super();
		this.id = id;
		this.game = game;
		this.viewers = viewers;
		this.creationTime = creationTime;
		this.fps = fps;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public String getViewers() {
		return viewers;
	}
	public void setViewers(String viewers) {
		this.viewers = viewers;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
	public String getFps() {
		return fps;
	}
	public void setFps(String fps) {
		this.fps = fps;
	}
	
}
