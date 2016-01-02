package com.tutorialspoint.Dao.interfaces;

import java.util.List;

import com.tutorialspoint.Dao.db.Student;

public interface StudentDaoInterface {
	
	public Student add (Student student);
	public List getAll();

}
