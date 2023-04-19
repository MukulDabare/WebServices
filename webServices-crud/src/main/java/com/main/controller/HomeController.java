package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;
import com.main.serviceI.HomeService;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	
	@GetMapping ("/getSingleStudent/{username}/{password}")
	public Student singleStudent(@PathVariable String username, 
			@PathVariable String password)
	{
		Student student = hs.getSingleStudent(username, password);
		return student;
	}
	
	@GetMapping ("/getAllStudent")
	public Iterable<Student> getAllStudent()
	{
		Iterable<Student> allStudent = hs.getAllStudent();
		return allStudent;
		
	}
	
    @PostMapping ("/registerdata")
	public String  setStudent(@RequestBody Student s)
	{
    	hs.setStudent(s);
		return "Registered";
	}
    
    @PutMapping ("/updateStudent/{rollno}")
    public String updateStudent(@PathVariable int rollno, @RequestBody Student s)
    {
    	hs.setStudent(s);
    	return "Student Updated";
    }
    
    @DeleteMapping ("/deleteStudent/{rollno}")
    public String deleteStudent(@PathVariable int rollno)
    {
    	hs.deleteStudent(rollno);
    	hs.getAllStudent();
    	return "Student Deleted ";
    }
    @PatchMapping ("/updateStudentData/{rollno}")
    public String updateStudentData(@PathVariable int rollno, @RequestBody Student s)
    {
    	hs.saveStudent(s, rollno);
    	return "Student Updated";
    }
    

    
    
    
}
