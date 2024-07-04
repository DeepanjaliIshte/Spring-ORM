package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao {
	private HibernateTemplate hibernatetemplate;
	//save student
	@Transactional
	public int insert(Student student)
	{
		//insert
		Integer i=(Integer)this.hibernatetemplate.save(student);
		return i;
	}

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}
	
}
