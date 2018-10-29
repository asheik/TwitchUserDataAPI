package com.asif.jsonmodel;


public class Channel {
	private String logo;

	private String status;

	private String game;

	private String profile_banner;

	private String url;

	private String display_name;

	private String followers;

	private String video_banner;

	private String updated_at;

	private String _id;

	private String views;

	private String mature;

	private String broadcaster_language;

	private String name;

	private String created_at;

	private String partner;

	private String language;

	public Channel(String logo, String status, String game,
			String profile_banner, String url, String display_name,
			String followers, String video_banner, String updated_at,
			String _id, String views, String mature,
			String broadcaster_language, String name, String created_at,
			String partner, String language) {
		super();
		this.logo = logo;
		this.status = status;
		this.game = game;
		this.profile_banner = profile_banner;
		this.url = url;
		this.display_name = display_name;
		this.followers = followers;
		this.video_banner = video_banner;
		this.updated_at = updated_at;
		this._id = _id;
		this.views = views;
		this.mature = mature;
		this.broadcaster_language = broadcaster_language;
		this.name = name;
		this.created_at = created_at;
		this.partner = partner;
		this.language = language;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getProfile_banner() {
		return profile_banner;
	}

	public void setProfile_banner(String profile_banner) {
		this.profile_banner = profile_banner;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDisplay_name() {
		return display_name;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	public String getFollowers() {
		return followers;
	}

	public void setFollowers(String followers) {
		this.followers = followers;
	}

	public String getVideo_banner() {
		return video_banner;
	}

	public void setVideo_banner(String video_banner) {
		this.video_banner = video_banner;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getViews() {
		return views;
	}

	public void setViews(String views) {
		this.views = views;
	}

	public String getMature() {
		return mature;
	}

	public void setMature(String mature) {
		this.mature = mature;
	}

	public String getBroadcaster_language() {
		return broadcaster_language;
	}

	public void setBroadcaster_language(String broadcaster_language) {
		this.broadcaster_language = broadcaster_language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Channel [logo=" + logo + ", status=" + status + ", game="
				+ game + ", profile_banner=" + profile_banner + ", url=" + url
				+ ", display_name=" + display_name + ", followers=" + followers
				+ ", video_banner=" + video_banner + ", updated_at="
				+ updated_at + ", _id=" + _id + ", views=" + views
				+ ", mature=" + mature + ", broadcaster_language="
				+ broadcaster_language + ", name=" + name + ", created_at="
				+ created_at + ", partner=" + partner + ", language="
				+ language + "]";
	}
}
