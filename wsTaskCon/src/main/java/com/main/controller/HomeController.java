package com.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.main.model.Student;
@CrossOrigin ("*")
@RestController
public class HomeController {
	@Autowired
	RestTemplate rt;

	@RequestMapping ("/getCon")
	public List<Student> getData()
	{
		
		String url1="http://localhost:9092/getData1";
		List<Student> list1 = rt.getForObject(url1, List.class);
       
		String url2="http://localhost:9093/getData2";
		List<Student> list2 = rt.getForObject(url2, List.class);
		
		String url3="http://localhost:9094/getData3";
		List<Student> list3 = rt.getForObject(url3, List.class);
		List<Student> l=new ArrayList<>();
		l.addAll(list1);
		l.addAll(list2);
		l.addAll(list3);
	    return l;
	}
	
	@PostMapping ("/regcon")
	public String regConData(@RequestBody Student s)
	{
		String url="http://localhost:9092/regData";
		String msg = rt.postForObject(url, s, String.class);
		System.out.println("COnsume Name "+s.getUsername());
		return msg;
	}
	
	@RequestMapping ("/getCon/{username}/{password}")
	public Student getdata(@PathVariable String username,
			@PathVariable String password )
	{
		System.out.println("Username "+ username);
		System.out.println("Password "+ password);
		String url1="http://localhost:9092/getData1";
		List<Student> list1 = rt.getForObject(url1, List.class);
		for(Student s:list1)
		{
			if(s.getUsername().equals(username) && s.getPassword().equals(password))
			{
				return s;
			}
		}
		return null;
	}

	
}
