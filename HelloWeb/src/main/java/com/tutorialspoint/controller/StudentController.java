package com.tutorialspoint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
	
	@Value("#{myProps['paging.page-size']}")
    private int pageSize;

	//addStudent  GET: wyswietla okno danych do dodania
	//addStudent POST: obsluguje dodanie danych do bazy
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
		logger.info("addStudent (POST): " + student);
		studentDaoImpl.add(student);
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());
		return "result";
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.GET)
	public ModelAndView addStudent() {
		logger.info("addStudent (GET)");
		return new ModelAndView("addStudent", "command", new Student());
	}
	
	@RequestMapping(value = "/showAll", method = RequestMethod.GET)
	public String showStudents(@RequestParam(value = "page", required = false) String requestedPage, ModelMap model) {
		
		long numberOfRecords = studentDaoImpl.size();
		int numberOfPages = (int) Math.ceil(1.0 * numberOfRecords / pageSize);
		int currentPage = (requestedPage == null ? 1 : new Integer(requestedPage).intValue());
		
		List<Student> students = studentDaoImpl.getAll(pageSize, (currentPage-1) * pageSize);
		model.addAttribute("numberOfPages", numberOfPages);
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("numberOfStudents", numberOfRecords);
		model.addAttribute("studentList", students);
		
		logger.info("numberOfPages" + numberOfPages + 
				", currentPage" + currentPage +
				", numberOfStudents" + numberOfRecords);
		
		return "showAll";
	}
	
	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
	public String deleteStudent(@RequestParam("id") int studentId, ModelMap model) {
		logger.info("deleteStudent: " + studentId);
		model.addAttribute("id", studentId);
		Student s = new Student();
		s.setId(studentId);
		studentDaoImpl.delete(s);
		return "deleteStudent";
	}
	
	//editStudent  GET: wyswietla okno danych do edycji
	//editStudent POST: obsluguje aktualizacje danych
	@RequestMapping(value = "/editStudent", method = RequestMethod.GET)
	public String editStudent(@RequestParam("id") int studentId, ModelMap model) {
		Student s = studentDaoImpl.get(studentId);
		logger.info("editStudent (GET): " + s);
		model.addAttribute("id", studentId);
		model.addAttribute("age", s.getAge());
		model.addAttribute("name", s.getName());
		return "editStudent";
	}
	
	@RequestMapping(value = "/editStudent", method = RequestMethod.POST)
	public String editStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
		logger.info("editStudent (POST): " + student);
		studentDaoImpl.update(student);
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getId());
		return "result";
	}
	
}