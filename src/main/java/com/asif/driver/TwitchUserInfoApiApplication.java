package com.asif.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.asif.controller","com.asif.configuration"})
public class TwitchUserInfoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitchUserInfoApiApplication.class, args);
	}
}
