package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WsTaskPro1Application {

	public static void main(String[] args) {
		SpringApplication.run(WsTaskPro1Application.class, args);
	}
	
	@Bean
	public RestTemplate rt()
	{
		RestTemplate rs=new RestTemplate();
		return rs;
	}

}
