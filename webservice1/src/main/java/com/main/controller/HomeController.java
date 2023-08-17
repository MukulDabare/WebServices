package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.main.model.Student;

@RestController
public class HomeController {
	@Autowired
	RestTemplate rt;
	
@RequestMapping ("/getCon")
	public Student getdata() {
		String url="http://localhost:9093/getdata";
		Student student = rt.getForObject(url, Student.class);
	
		return student;
	}
}
