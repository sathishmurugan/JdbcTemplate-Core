package com.sathish.dao;

import com.sathish.model.Student;

public class TestStudentDAO {

	public static void main(String[] args) {
		Student student=new Student();
		student.setName("sathish");
		student.setEmail("ms.sathish.26@gmail.com");
		student.setPassword("chennai");
		StudentDAO dao = new StudentDAO();
		dao.save(student);

	}

}
