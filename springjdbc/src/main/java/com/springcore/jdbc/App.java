package com.springcore.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.Entities.Student;
import com.springcore.jdbc.dao.StudentDao;

public class App {

	public static void main(String[] args) {
		System.out.println("My program started....."); 
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/jdbc/config.xml") ;
		StudentDao studentDao =	
	context.getBean("StudentDao",StudentDao.class) ;
		Student student = new Student() ;
		student.setID(666);
		student.setName("John");
		student.setCity("Lucknow");
		
 
	int result = studentDao.insert(student) ;
	System.out.println("Student added : " + result);
	
	}

}
