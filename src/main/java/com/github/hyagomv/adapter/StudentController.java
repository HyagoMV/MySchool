package com.github.hyagomv.adapter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.hyagomv.entity.StudentDto;
import com.github.hyagomv.entity.StudentEntity;
import com.github.hyagomv.usecase.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	private StudentService service;
	
	public StudentController(StudentService service) {
		this.service = service;
	}
	
	@GetMapping("/create")
	public String showForm(Model model) {
		System.out.println("showForm");
		
		model.addAttribute("student", new StudentDto());
		
		return "student";
	}
	
	@PostMapping("/create")
	public String doCreate(@ModelAttribute StudentDto student) {
		System.out.println("doCreate");
		
		service.save(student);
		
		return "redirect:/student/create";
	}
}
