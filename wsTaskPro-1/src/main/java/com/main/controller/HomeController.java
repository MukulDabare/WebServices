package com.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;

@RestController
public class HomeController {
	
    List<Student> list= new ArrayList<>();
 
	
	@RequestMapping ("/getData1")
	public List<Student> getData()
	{
		Student s1= new Student();
		s1.setRollno(1);
		s1.setName("Manik");
		s1.setAddr("Jammu");
		s1.setUsername("Manik");
		s1.setPassword("123");
		list.add(s1);
		
		Student s2= new Student();
		s2.setRollno(2);
		s2.setName("Nanik");
		s2.setAddr("Jammu");
		s2.setUsername("Nanik");
		s2.setPassword("123");
		list.add(s2);
		
		Student s3= new Student();
		s3.setRollno(3);
		s3.setName("Sanik");
		s3.setAddr("Tammu");
		s3.setUsername("Sanik");
		s3.setPassword("123");
		list.add(s3);
		   List<Student> sort=new ArrayList<>();
	    for(Student s:list) {
    	if(s.getAddr().equals("Jammu"))
		{
			sort.add(s);
		} 
    }
		
		return sort;
		
	}
	
	@PostMapping ("/regData")
	public String regData(@RequestBody Student s)
	{
		System.out.println("UserName "+ s.getUsername());
		return "Save Data";
	}
}
