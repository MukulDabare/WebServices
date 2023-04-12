package com.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;

@RestController
public class HomeController {
	
	
	List<Student> s;
	
	@RequestMapping (value= "/getStudentData", method = RequestMethod.GET)
	public List<Student>  preLogin()
	{
		s=new ArrayList<>();
		Student s1=new Student();
		s1.setName("Manik");
		s1.setRollno(1);
		s1.setUsername("Manik");
		s1.setPassword("123");
		
		s.add(s1);
		
		Student s2=new Student();
		s2.setName("Amrit");
		s2.setRollno(2);
		s2.setUsername("Amrit");
		s2.setPassword("123");
		s.add(s2);
		
		return s;
	}
	
	@GetMapping (value = "/reg/{username}/{password}")
	public List<Student> login(@PathVariable String username, 
			@PathVariable String password)
	{
		if(username.equals("ADMIN")&& password.equals("ADMIN"))
		{
			List<Student> list = preLogin();
			return list;
		}
		else {
			
			List<Student> stu = preLogin();
			for(Student sd:stu)
			{
		      if(username.equals(sd.getUsername())&& password.equals(sd.getPassword()))
		      {
		    	  List<Student> st= new ArrayList<>();
		    	  st.add(sd);
		    	  return st;
		      }
			}
			return null;
		}
		
		
	}

}
