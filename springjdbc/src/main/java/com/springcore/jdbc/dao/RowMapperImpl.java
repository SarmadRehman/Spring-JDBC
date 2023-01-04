package com.springcore.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springcore.jdbc.Entities.Student;

public class RowMapperImpl implements RowMapper<Student> {
	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException  {
		Student student = new Student () ;
		student.setID(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		return student;

}


}