package com.main.serviceI;

import com.main.model.Student;

public interface HomeService {
	
  public void setStudent(Student s);
  public Student getSingleStudent(String username, String password);
  public Iterable<Student> getAllStudent();
  public void deleteStudent(int rollno);
  public void saveStudent (Student s, int rollno);
}
