package com.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;

@RestController
public class HomeController {
	
    List<Student> list= new ArrayList<>();
 
	
	@RequestMapping ("/getData3")
	public List<Student> getData()
	{
		Student s1= new Student();
		s1.setRollno(7);
		s1.setName("Eanik");
		s1.setAddr("Jammu");
		s1.setUsername("Eanik");
		s1.setPassword("123");
		list.add(s1);
		
		Student s2= new Student();
		s2.setRollno(8);
		s2.setName("Fanik");
		s2.setAddr("Jammu");
		s2.setUsername("Fanik");
		s2.setPassword("123");
		list.add(s2);
		
		Student s3= new Student();
		s3.setRollno(9);
		s3.setName("Ganik");
		s3.setAddr("Tammu");
		s3.setUsername("Ganik");
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
}
