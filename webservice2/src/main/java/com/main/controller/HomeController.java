package com.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;

@RestController
public class HomeController {

	@RequestMapping ("/getdata")
	public Student getdata()
	{
		Student s=new Student();
		s.setRollno(1);
		s.setName("Manik");
		s.setAddr("Jammu");
		return s;
	}
}
