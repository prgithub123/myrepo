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

	@Override
	public Student get(int studentId) {
		String query = "from Student S where S.id = " + studentId;
		if (getCurrentSession().createQuery(query).list().size() == 1) {
			return (Student) getCurrentSession().createQuery(query).list().get(0);
		} else {
			return null;
		}
	}

	@Override
	public void update(Student student) {
		getCurrentSession().update(student);
	}

}
