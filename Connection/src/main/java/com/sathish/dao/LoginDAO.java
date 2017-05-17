package com.sathish.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sathish.model.Student;
import com.sathish.util.ConnectionUtil;

public class LoginDAO {
public void login(Student student)
{
	JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
	String sql="SELECT * FROM student_detials WHERE email = ? And password = ? ";
	Object[] obj={student.getEmail(),student.getPassword()};
student=jdbcTemplate.queryForObject(sql, (rs,rno)->

{
	Student s=new Student();
	s.setEmail(rs.getString("email"));
	return s;
	
}
)
;
} 

}
