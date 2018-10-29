package com.asif.jsonmodel;


public class StreamAPI {
	private Stream stream;

	public StreamAPI(Stream stream) {
		super();
		this.stream = stream;
	}

	public Stream getStream() {
		return stream;
	}

	public void setStream(Stream stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "ClassPojo [stream = " + stream + "]";
	}

}