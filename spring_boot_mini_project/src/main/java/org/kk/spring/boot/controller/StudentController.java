package org.kk.spring.boot.controller;


import java.util.List;

import org.kk.spring.boot.model.Student;
import org.kk.spring.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping ("/student")
public class StudentController {

	@Autowired 
	private StudentService service;
	
	@RequestMapping ("/register")
	public String getStudent(ModelMap map) {
		map.addAttribute("student", new Student());
		map.addAttribute("Mode", "EDIT");
		return "register";
	}
	
	@RequestMapping (value = "/save", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute Student student, ModelMap map) {
		// call service layer
		Integer id = service.saveStudent(student);
		map.addAttribute("message", "Student '" + id + "' created");
		
		map.addAttribute("student", new Student());
		return "register";
	}
	
	@RequestMapping ("/showAll")
	public String showAllStudents(ModelMap map) {
		List<Student> listStudent = service.getAllStudents();
		map.addAttribute("listStudentDetails", listStudent);
		return "student_deta";
	}
	
	@RequestMapping ("/delete")
	public String deleteStudentById(@RequestParam Integer sid) {
		service.deleteStudent(sid);
		return "redirect:showAll";
	}
	
	@RequestMapping ("/getOne/{sid}")
	public String getOneStudent(@PathVariable Integer sid, ModelMap map) throws Exception{
		Student student = service.getStudentById(sid);
		map.addAttribute("getOneStudent", student);
		return "view";
	}
	
	@RequestMapping (value = "/edit")
	public String editStudentById(@RequestParam Integer sid, ModelMap map) {
		service.getStudentById(sid);
		Student student =service.getStudentById(sid);
		//From BACKING OBJECT
		map.addAttribute("student", student);
		map.addAttribute("Mode", "REGISTER");
		return "student_edit";
	}
	
	@RequestMapping ("/update")
	public String updateStudent(@ModelAttribute Student student) {
		service.studentUpdate(student);
		return "redirect:showAll";
	}
	
}

