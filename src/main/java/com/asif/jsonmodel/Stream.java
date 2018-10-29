package com.asif.jsonmodel;


public class Stream {
	private String video_height;

	private String viewers;

	private Preview preview;

	private String _id;

	private String average_fps;

	private String created_at;

	private String is_playlist;

	private String delay;

	private String game;

	private Channel channel;

	public Stream(String video_height, String viewers, Preview preview,
			String _id, String average_fps, String created_at,
			String is_playlist, String delay, String game, Channel channel) {
		super();
		this.video_height = video_height;
		this.viewers = viewers;
		this.preview = preview;
		this._id = _id;
		this.average_fps = average_fps;
		this.created_at = created_at;
		this.is_playlist = is_playlist;
		this.delay = delay;
		this.game = game;
		this.channel = channel;
	}

	public String getVideo_height() {
		return video_height;
	}

	public void setVideo_height(String video_height) {
		this.video_height = video_height;
	}

	public String getViewers() {
		return viewers;
	}

	public void setViewers(String viewers) {
		this.viewers = viewers;
	}

	public Preview getPreview() {
		return preview;
	}

	public void setPreview(Preview preview) {
		this.preview = preview;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getAverage_fps() {
		return average_fps;
	}

	public void setAverage_fps(String average_fps) {
		this.average_fps = average_fps;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getIs_playlist() {
		return is_playlist;
	}

	public void setIs_playlist(String is_playlist) {
		this.is_playlist = is_playlist;
	}

	public String getDelay() {
		return delay;
	}

	public void setDelay(String delay) {
		this.delay = delay;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return "ClassPojo [video_height = " + video_height + ", viewers = "
				+ viewers + ", preview = " + preview + ", _id = " + _id
				+ ", average_fps = " + average_fps + ", created_at = "
				+ created_at + ", is_playlist = " + is_playlist + ", delay = "
				+ delay + ", game = " + game + ", channel = " + channel + "]";
	}
}
