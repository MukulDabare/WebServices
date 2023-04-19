package com.main.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Student;
import com.main.repositoryI.HomeRepository;
import com.main.serviceI.HomeService;
@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeRepository hr;
	
	
	@Override
	public void setStudent(Student s) {
		hr.save(s);
		
	}
	@Override
	public Student getSingleStudent(String username, String password) {
		Student student = hr.findByUsernameAndPassword(username, password);
		return student;
	}
	@Override
	public Iterable<Student> getAllStudent() {
		
		return hr.findAll();
	}
	@Override
	public void deleteStudent(int rollno) {
		
		hr.deleteById(rollno);
	}
	@Override
	public void saveStudent(Student s, int rollno) {
		Optional<Student> id = hr.findById(rollno);
		Student student = new Student();
		if(id.isEmpty()) {
			System.out.println("no data");
		}else {

			student = id.get();
			student.setName(s.getName());
			student.setPassword(s.getPassword());
			student.setUsername(s.getUsername());
			student.setRollno(s.getRollno());
		}
		
		hr.save(student);
		
		
	}
	

}
