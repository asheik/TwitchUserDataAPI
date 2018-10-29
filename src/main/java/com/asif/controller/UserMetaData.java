package com.asif.controller;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asif.viewmodel.ChannelInfo;
import com.asif.viewmodel.StreamInfo;
import com.asif.viewmodel.User;
import com.asif.service.*;

@Api(value = "TwitchAPI - User and Channel Metadata", description = "Rest API for User and Channel Info")
@RestController
public class UserMetaData {
	
	@ApiOperation(value = "Get user information", response = User.class, tags = "User Data")
	@GetMapping(value="/user/{name}")
	public User getUserData(@PathVariable("name") String name){
		return JsonReader.getUserView(name);
	}
	
	@ApiOperation(value = "Get channel information of user ", response = ChannelInfo.class, tags = "Channel Data")
	@GetMapping(value="/channel/{name}")
	public ChannelInfo getChannelData(@PathVariable("name") String name){
		return JsonReader.getChannelView(name);
	}
	
	@ApiOperation(value = "Get stream information of user ", response = StreamInfo.class, tags = "Stream Data")
	@GetMapping(value="/stream/{name}")
	public StreamInfo getStreamInfo(@PathVariable("name") String name){
		return JsonReader.getStreamView(name);
	}
	@ApiOperation(value = "Get information of multiple users (separate usernames with &)", response = User.class, tags = "User Data")
	@GetMapping(value="/users/{names}")
	public List<User> getUsersData(@PathVariable("names") String names){
		String [] namesArr = names.split("&");
		List<User> users = new ArrayList<User>(); 
		for(String name : namesArr){
			users.add(JsonReader.getUserView(name));
		}
		return users;
	}
	@ApiOperation(value = "Get information of multiple channels (separate usernames with &)", response = ChannelInfo.class, tags = "Channel Data")
	@GetMapping(value="/channels/{channels}")
	public List<ChannelInfo> getChannelsData(@PathVariable("channels") String channels){
		String [] channelArr = channels.split("&");
		List<ChannelInfo> chanList = new ArrayList<ChannelInfo>(); 
		for(String chan : channelArr){
			chanList.add(JsonReader.getChannelView(chan));
		}
		return chanList;
	}
	@ApiOperation(value = "Get information of multiple streams (separate usernames with &)", response = StreamInfo.class, tags = "Stream Data")
	@GetMapping(value="/streams/{streams}")
	public List<StreamInfo> getStreamsData(@PathVariable("streams") String streams){
		String [] streamarr = streams.split("&");
		List<StreamInfo> streamList = new ArrayList<StreamInfo>(); 
		for(String stream : streamarr){
			streamList.add(JsonReader.getStreamView(stream));
		}
		return streamList;
	}
}
