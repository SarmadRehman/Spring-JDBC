package com.springcore.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springcore.jdbc.dao.StudentDao;
import com.springcore.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.springcore.jdbc.dao"})
public class jdbcConfig {
    @Bean("ds")
	public DriverManagerDataSource getDataSource() 
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		ds.setUsername("system");
		ds.setPassword("helloworld");
		return ds; 
		}
	@Bean ("jdbcTempLate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate() ;
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	@Bean ("StudentDao")
	public StudentDao getStudentDao () {
		StudentDaoImpl studentDao = new StudentDaoImpl() ;
		studentDao.setJdbctemplate(getTemplate());
		return studentDao;
	}
}
