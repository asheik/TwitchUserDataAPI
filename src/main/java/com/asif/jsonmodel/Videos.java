package com.asif.jsonmodel;


public class Videos {
	private String description_html;

	private String status;

	public Videos(String description_html, String status, Fps fps,
			String animated_preview_url, String game, String recorded_at,
			String url, String broadcast_type, String published_at,
			String title, String preview, String _id, String tag_list,
			String description, String views, String length, String created_at,
			String language, String broadcast_id, Channel channel) {
		super();
		this.description_html = description_html;
		this.status = status;
		this.fps = fps;
		this.animated_preview_url = animated_preview_url;
		this.game = game;
		this.recorded_at = recorded_at;
		this.url = url;
		this.broadcast_type = broadcast_type;
		this.published_at = published_at;
		this.title = title;
		this.preview = preview;
		this._id = _id;
		this.tag_list = tag_list;
		this.description = description;
		this.views = views;
		this.length = length;
		this.created_at = created_at;
		this.language = language;
		this.broadcast_id = broadcast_id;
		this.channel = channel;
	}

	private Fps fps;

	private String animated_preview_url;

	private String game;

	private String recorded_at;

	private String url;

	private String broadcast_type;

	private String published_at;

	private String title;

	private String preview;

	private String _id;

	private String tag_list;

	private String description;

	private String views;

	private String length;

	private String created_at;

	private String language;

	private String broadcast_id;

	private Channel channel;

	public String getDescription_html() {
		return description_html;
	}

	public void setDescription_html(String description_html) {
		this.description_html = description_html;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Fps getFps() {
		return fps;
	}

	public void setFps(Fps fps) {
		this.fps = fps;
	}

	public String getAnimated_preview_url() {
		return animated_preview_url;
	}

	public void setAnimated_preview_url(String animated_preview_url) {
		this.animated_preview_url = animated_preview_url;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getRecorded_at() {
		return recorded_at;
	}

	public void setRecorded_at(String recorded_at) {
		this.recorded_at = recorded_at;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBroadcast_type() {
		return broadcast_type;
	}

	public void setBroadcast_type(String broadcast_type) {
		this.broadcast_type = broadcast_type;
	}

	public String getPublished_at() {
		return published_at;
	}

	public void setPublished_at(String published_at) {
		this.published_at = published_at;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPreview() {
		return preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getTag_list() {
		return tag_list;
	}

	public void setTag_list(String tag_list) {
		this.tag_list = tag_list;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getViews() {
		return views;
	}

	public void setViews(String views) {
		this.views = views;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getBroadcast_id() {
		return broadcast_id;
	}

	public void setBroadcast_id(String broadcast_id) {
		this.broadcast_id = broadcast_id;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return "Videos [description_html=" + description_html + ", status="
				+ status + ", fps=" + fps + ", animated_preview_url="
				+ animated_preview_url + ", game=" + game + ", recorded_at="
				+ recorded_at + ", url=" + url + ", broadcast_type="
				+ broadcast_type + ", published_at=" + published_at
				+ ", title=" + title + ", preview=" + preview + ", _id=" + _id
				+ ", tag_list=" + tag_list + ", description=" + description
				+ ", views=" + views + ", length=" + length + ", created_at="
				+ created_at + ", language=" + language + ", broadcast_id="
				+ broadcast_id + ", channel=" + channel + "]";
	}

}