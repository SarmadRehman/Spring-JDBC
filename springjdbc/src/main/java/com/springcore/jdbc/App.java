package com.springcore.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

	public static void main(String[] args) {
		System.out.println("My program started....."); 
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/jdbc/config.xml") ;
	JdbcTemplate temp =	
	context.getBean("jdbcTempLate",JdbcTemplate.class) ;
   //insert query
	String query = "INSERT INTO student (id, name, city) VALUES (?, ?, ?)";
	int result = temp.update(query, 99, "gulnabi" , "terah") ;
	System.out.println(result);
	}

}
