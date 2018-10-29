package com.asif.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.asif.configurationmodel.TwitchConfig;

@Configuration
@PropertySource("classpath:application.properties")
public class TwitchAPIConfiguration {
	
	@Value("${twitch.clientid}")
	private String clientid;
	
	@Value("${twitch.userurl}")
	private String userUrl;
	
	@Value("${twitch.channelurl}")
	private String channelUrl;
	
	@Value("${twitch.streamurl}")
	private String streamUrl;
	
	@Bean
	public TwitchConfig twitchConfig(){
		return new TwitchConfig(clientid, userUrl, channelUrl, streamUrl);
		
	}

}
