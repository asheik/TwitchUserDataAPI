package com.asif.jsonmodel;


public class Fps {
	private String chunked;

	private String audio_only;

	private String high;

	public Fps(String chunked, String audio_only, String high, String low,
			String medium, String mobile) {
		super();
		this.chunked = chunked;
		this.audio_only = audio_only;
		this.high = high;
		this.low = low;
		this.medium = medium;
		this.mobile = mobile;
	}

	private String low;

	private String medium;

	private String mobile;

	public String getChunked() {
		return chunked;
	}

	public void setChunked(String chunked) {
		this.chunked = chunked;
	}

	public String getAudio_only() {
		return audio_only;
	}

	public void setAudio_only(String audio_only) {
		this.audio_only = audio_only;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "ClassPojo [chunked = " + chunked + ", audio_only = "
				+ audio_only + ", high = " + high + ", low = " + low
				+ ", medium = " + medium + ", mobile = " + mobile + "]";
	}
}
