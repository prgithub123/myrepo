package com.tutorialspoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tutorialspoint.Dao.db.Student;
import com.tutorialspoint.Dao.interfaces.StudentDaoInterface;

import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")
public class StudentController {
	
	@Autowired
	StudentDaoInterface studentDaoImpl;

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student-bootstrap", "command", new Student());
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
		
		studentDaoImpl.add(student);
		
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());

		return "result";
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.GET)
	public ModelAndView addStudent() {
		return student();
	}
	
	@RequestMapping(value = "/showAll", method = RequestMethod.GET)
	public String showStudents(ModelMap model) {
		
		List students = studentDaoImpl.getAll();
		model.addAttribute("numberOfStudents", students.size());
		model.addAttribute("studentList", students);

		return "showAll-bootstrap";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	public String finalPage() {

		return "final";
	}

}