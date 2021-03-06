package com.asif.jsonmodel;


public class TwitchAPI {
	private String logo;

	private String display_name;

	private String updated_at;

	private String bio;

	private String _id;

	private String name;

	private String created_at;

	private String type;

	public TwitchAPI(String logo, String display_name, String updated_at,
			String bio, String _id, String name, String created_at, String type) {
		super();
		this.logo = logo;
		this.display_name = display_name;
		this.updated_at = updated_at;
		this.bio = bio;
		this._id = _id;
		this.name = name;
		this.created_at = created_at;
		this.type = type;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getDisplay_name() {
		return display_name;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ClassPojo [logo = " + logo + ", display_name = " + display_name
				+ ", updated_at = " + updated_at + ", bio = " + bio
				+ ", _id = " + _id + ", name = " + name + ", created_at = "
				+ created_at + ", type = " + type + "]";
	}
}
