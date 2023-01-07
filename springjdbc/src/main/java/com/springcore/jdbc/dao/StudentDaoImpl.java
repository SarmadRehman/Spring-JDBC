package com.springcore.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springcore.jdbc.Entities.Student;
@Component("StudentDao")
public class StudentDaoImpl implements StudentDao{
	@Autowired
	private  JdbcTemplate jdbctemplate ;
	public int insert(Student student) {
		 //insert query
		String query = "INSERT INTO student (id, name, city) VALUES (?, ?, ?)";
		int r = this.jdbctemplate.update(query,student.getID(),student.getName(),student.getCity());
		return r;
	}
	public int change(Student student) {
		// updating data 
		String query = "update student set name = ?, city = ? where id = ?";
    	int r = this.jdbctemplate.update(query,student.getName(),student.getCity(), student.getID()) ;
		return r;
	}
	public int delete(int studentID) {
		String query = "DELETE FROM student WHERE id = ?";
		int r = this.jdbctemplate.update(query,studentID) ;
		return r;
	}
	
	public Student getstudent(int studentID) {
		String query = "select * from student where id = ?" ;
		RowMapper<Student> rowMapper = new RowMapperImpl();
	Student student = 	this.jdbctemplate.queryForObject(query, rowMapper, studentID);
		return student;
	}
	
	public List<Student> getAllStudents() {
		//selecting multiple students
		String query = "select * from student" ;
		List<Student> students = this.jdbctemplate.query(query,new RowMapperImpl());
		return students;
	}
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	

	
	
	
	

}
