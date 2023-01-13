package com.springcore.jdbc.dao;
// 'Dao' -> data access object
import java.util.List;

import com.springcore.jdbc.Entities.Student;

public interface StudentDao {
public int insert (Student student) ; 
public int change(Student student) ;
public int delete(int studentID) ;
public Student getstudent (int studentID);
public List<Student> getAllStudents();
}