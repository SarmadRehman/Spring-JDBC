package com.springcore.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.Entities.Student;

public class StudentDaoImpl implements StudentDao{
	private  JdbcTemplate jdbctemplate ;
	public int insert(Student student) {
		 //insert query
		String query = "INSERT INTO student (id, name, city) VALUES (?, ?, ?)";
		int r = this.jdbctemplate.update(query,student.getID(),student.getName(),student.getCity());
		return r;
	}
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	public int insert() {
		// TODO Auto-generated method stub
		return 0;
	}

}
