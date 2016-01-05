package com.tutorialspoint.Dao.impl;

import java.util.List;

import org.hibernate.Query;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAll() {
		return (List<Student>) getCurrentSession().createQuery("from Student").list();
	}

	@Override
	public void delete(Student student) {
		getCurrentSession().delete(student);
	}

	@Override
	public Student get(int studentId) {
		String hql = "from Student S where S.id = :studentId";
		Query query = getCurrentSession().createQuery(hql);
		query.setParameter("studentId", studentId);
		List results = query.list();

		if (results.size() == 1) {
			return (Student) results.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void update(Student student) {
		getCurrentSession().update(student);
	}

}
