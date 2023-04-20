package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WsTaskUiApplication {

	public static void main(String[] args) {
		
		System.out.println("This is Web service UI controller");
		SpringApplication.run(WsTaskUiApplication.class, args);
	}

}
