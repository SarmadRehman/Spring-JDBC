package com.springcore.jdbc;

import java.util.List;
import java.util.Scanner;

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
		
		               //INSERTION
		Student student = new Student() ;
		student.setID(666);
		student.setName("John");
		student.setCity("Lucknow");
	int result = studentDao.insert(student) ;
	System.out.println("Student added : " + result);
	
	//}
	  /*               //UPDATATION 
	
		Student student = new Student () ;
		student.setID(666) ;
		student.setName("Lalan Tiwari") ;
		student.setCity("Lucknow") ;
		int result = studentDao.change(student);
		
		System.out.println("data changed : " + result);
		
		            // DELETION
		int result = studentDao.delete(17) ;
		
		System.out.println("data deleted : " + result);
		
		
		// Taking user-input
		Scanner obj = new Scanner (System.in) ;
		System.out.println("Enter the ID to delete : ");
		int studentID = obj.nextInt() ;
		int result = studentDao.delete(studentID) ;
		System.out.println("data deleted : " + result);
		*/

		
//		Student student = studentDao.getstudent(77) ;
//		System.out.println(student);
		List <Student> students = studentDao.getAllStudents() ;
		for(Student s: students) {
			System.out.println(s);
		}
	}	
}
