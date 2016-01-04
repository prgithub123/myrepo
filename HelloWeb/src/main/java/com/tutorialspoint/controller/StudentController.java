package com.tutorialspoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tutorialspoint.Dao.db.Student;
import com.tutorialspoint.Dao.interfaces.StudentDaoInterface;

import org.springframework.ui.ModelMap;

import org.apache.log4j.Logger;

@Controller
@RequestMapping("/")
public class StudentController {
	
	final static Logger logger = Logger.getLogger(StudentController.class);
	
	@Autowired
	StudentDaoInterface studentDaoImpl;

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
		
		logger.info("addStudent: " + student.toString());
		
		studentDaoImpl.add(student);
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());
		return "result";
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.GET)
	public ModelAndView addStudent() {
		
		logger.info("addStudent: (bezparametrowy)");
		return new ModelAndView("addStudent", "command", new Student());
	}
	
	@RequestMapping(value = "/showAll", method = RequestMethod.GET)
	public String showStudents(ModelMap model) {
		logger.info("showAll");
		
		List students = studentDaoImpl.getAll();
		model.addAttribute("numberOfStudents", students.size());
		model.addAttribute("studentList", students);
		return "showAll";
	}
	
	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
	public String deleteStudent(@RequestParam("id") int studentId, ModelMap model) {
		logger.info("deleteStudent: " + studentId);
		model.addAttribute("id", studentId);
		
		return "deleteStudent";
	}
	
}