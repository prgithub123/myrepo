package com.tutorialspoint.Dao.interfaces;

import java.util.List;

import com.tutorialspoint.Dao.db.Student;

public interface StudentDaoInterface {
	
	public Student add (Student student);
	public List<Student> getAll();
	public List<Student> getAll(int limit, int offset);
	public Student get (int studentId);
	public void delete (Student student);
	public void update (Student student);

}
