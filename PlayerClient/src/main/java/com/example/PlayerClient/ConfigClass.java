package com.example.PlayerClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ConfigClass {

	
	@Bean
	public WebClient WebClient()
	{
		return WebClient.builder().baseUrl("http://localhost:8086").build();
	}
}
