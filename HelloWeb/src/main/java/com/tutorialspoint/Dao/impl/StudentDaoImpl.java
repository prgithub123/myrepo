package com.tutorialspoint.Dao.impl;

import java.util.List;

import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tutorialspoint.Dao.db.Student;
import com.tutorialspoint.Dao.interfaces.StudentDaoInterface;

@Transactional
@Repository
public class StudentDaoImpl implements StudentDaoInterface {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public Student add(Student student) {
		getCurrentSession().save(student);
		return student;
	}

	@Override
	public List getAll() {
		return getCurrentSession().createQuery("from Student").list();
	}

	@Override
	public void delete(Student student) {
		getCurrentSession().delete(student);
		
	}

}
