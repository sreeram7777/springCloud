package com.example.PlayerClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PlayerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayerClientApplication.class, args);
	}

}
