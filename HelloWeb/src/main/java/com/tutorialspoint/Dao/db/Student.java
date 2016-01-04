package com.tutorialspoint.Dao.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {

	@Id
	@Column(name="STUDENT_ID")
	int id;
	
	@Column(name="AGE")
	int age;
	
	@Column(name="NAME")
	String name;
	
	public Student() {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
}