package com.tutorialspoint.Dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tutorialspoint.Dao.db.Student;
import com.tutorialspoint.Dao.interfaces.StudentDaoInterface;
import com.tutorialspoint.controller.StudentController;

@Transactional
@Repository
public class StudentDaoImpl implements StudentDaoInterface {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	final static Logger logger = LoggerFactory.getLogger(StudentDaoImpl.class);
	
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
	
	/* Implementacja query: select * from Student limit x offset y
	 * limit - pokazuj maksymalnie x rekordow
	 * offset - rozpocznij od pozycji numer y (pierwszy wiersz jest indeksowany jako 0)
	 * HQL nie obsluguje parametrow :limit oraz :offset -> nalezy uzyc funkcji
	 * setFirstResult oraz setMaxResults
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAll(int limit, int offset) {
		logger.info("limit " + limit + ", offset " + offset);
		
		Query query = getCurrentSession().createQuery("from Student");
		query.setFirstResult(offset);
		query.setMaxResults(limit);
		List results = query.list();
		return (List<Student>) results;
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

		if (results.size() == 1)
			return (Student) results.get(0);
		return null;
	}

	@Override
	public void update(Student student) {
		getCurrentSession().update(student);
	}

	@Override
	public long size() {
		String hql = "select count(*) from Student";
		Query query = getCurrentSession().createQuery(hql);
		List results = query.list();
		if (results.size() == 1)
			return (long) results.get(0);
		return 0;
	}
}
