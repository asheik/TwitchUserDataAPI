package com.asif.service;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.asif.configuration.TwitchAPIConfiguration;
import com.asif.configurationmodel.TwitchConfig;
import com.asif.jsonmodel.Channel;
import com.asif.jsonmodel.Stream;
import com.asif.jsonmodel.StreamAPI;
import com.asif.jsonmodel.TwitchAPI;
import com.asif.jsonmodel.VideoAPI;
import com.asif.jsonmodel.Videos;
import com.asif.viewmodel.ChannelInfo;
import com.asif.viewmodel.StreamInfo;
import com.asif.viewmodel.User;
import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class JsonReader {
	private static OkHttpClient client = new OkHttpClient();
	static ApplicationContext context = new AnnotationConfigApplicationContext(TwitchAPIConfiguration.class);
	static TwitchConfig twitchconfig = context.getBean(TwitchConfig.class);
	private String url;
	
	/**
	 * Generates parsed JSON string
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public static String getJSON(String url)throws IOException{
		//make http req for json
		Request request = new Request.Builder()
			.url(url)
			.build();
		Response response = client.newCall(request).execute();
		return response.body().string();
	}
		
	public static User getUserView(String username){
		String json = null;
		try{
			String temp = twitchconfig.getUserUrl()+username+"?client_id="+twitchconfig.getClientid();
			json = getJSON(temp);
		} catch(Exception e){
			e.printStackTrace();
		}
		Gson gson = new Gson();
		
		//create a parsed json object
		TwitchAPI twitchAPI = gson.fromJson(json, TwitchAPI.class);
		
		//return selected variables
		return new User(twitchAPI.get_id(), twitchAPI.getName(), twitchAPI.getBio(), twitchAPI.getCreated_at());
	}
	
	public static ChannelInfo getChannelView(String username){
		String json = null;
		try{
			String temp = twitchconfig.getChannelUrl()+username+"?client_id="+twitchconfig.getClientid();
			json = getJSON(temp);
		} catch(Exception e){
			e.printStackTrace();
		}
		Gson gson = new Gson();
		
		//create a parsed json object
		Channel channel = gson.fromJson(json, Channel.class);
		System.out.println("");
		//return selected variables
		return new ChannelInfo(channel.get_id(), channel.getName(), channel.getDisplay_name(), 
				channel.getStatus(), channel.getUrl(), channel.getUpdated_at(), channel.getLanguage(),
				channel.getCreated_at());
	}
	
	public static StreamInfo getStreamView(String username){
		String json = null;
		try{
			String temp = twitchconfig.getStreamUrl()+username+"?client_id="+twitchconfig.getClientid();
			json = getJSON(temp);
		} catch(Exception e){
			e.printStackTrace();
		}
		Gson gson = new Gson();
		
		//create a parsed json object
		StreamAPI stream = gson.fromJson(json, StreamAPI.class);
		System.out.println("");
		//return selected variables
		return new StreamInfo(stream.getStream().get_id(), stream.getStream().getGame(), stream.getStream().getViewers(), 
				stream.getStream().getCreated_at(), stream.getStream().getAverage_fps());
	}
	

}
