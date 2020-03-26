package com.ittc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

@Configuration
public class WebConfig {

	@Autowired
	private Environment env;

	@Bean
	public Twitter getTwitter() {
		Twitter twitter = null;
		twitter = new TwitterTemplate(env.getProperty("spring.social.twitter.appId"),
				env.getProperty("spring.social.twitter.appSecret"));
		return twitter;
	}

}
