package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Webservice1Application {

	public static void main(String[] args) {
		System.out.println("Webservice 1");
		SpringApplication.run(Webservice1Application.class, args);
	}
	@Bean
	public RestTemplate rt()
	{
		RestTemplate rs= new RestTemplate();
		return rs;
	}

}
