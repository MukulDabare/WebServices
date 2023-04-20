package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WsTaskConApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsTaskConApplication.class, args);
	}
	
	@Bean
	public RestTemplate rt()
	{
		RestTemplate rs=new RestTemplate();
		return rs;
	}

}
