package com.sathish.util;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {
	public static BasicDataSource basicDataSource()
	{
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/student");
		ds.setUsername("root");
		ds.setPassword("password");
		return ds;	
	}
	public static JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(basicDataSource());
		return jdbcTemplate;
		
	}
	
}
