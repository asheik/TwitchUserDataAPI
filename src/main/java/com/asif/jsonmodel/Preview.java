package com.asif.jsonmodel;


public class Preview {
	private String template;

	private String small;

	private String large;

	private String medium;

	public Preview(String template, String small, String large, String medium) {
		super();
		this.template = template;
		this.small = small;
		this.large = large;
		this.medium = medium;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getSmall() {
		return small;
	}

	public void setSmall(String small) {
		this.small = small;
	}

	public String getLarge() {
		return large;
	}

	public void setLarge(String large) {
		this.large = large;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	@Override
	public String toString() {
		return "ClassPojo [template = " + template + ", small = " + small
				+ ", large = " + large + ", medium = " + medium + "]";
	}
}
