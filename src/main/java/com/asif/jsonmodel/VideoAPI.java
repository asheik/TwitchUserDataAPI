package com.asif.jsonmodel;


import java.util.Arrays;

public class VideoAPI {
	private Videos[] videos;

	private String _total;

	public VideoAPI(Videos[] videos, String _total) {
		super();
		this.videos = videos;
		this._total = _total;
	}

	public Videos[] getVideos() {
		return videos;
	}

	public void setVideos(Videos[] videos) {
		this.videos = videos;
	}

	public String get_total() {
		return _total;
	}

	public void set_total(String _total) {
		this._total = _total;
	}

	@Override
	public String toString() {
		return "VideoAPI [videos=" + Arrays.toString(videos) + ", _total="
				+ _total + "]";
	}

}
