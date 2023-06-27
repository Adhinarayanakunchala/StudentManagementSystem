package net.adhi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.adhi.model.Student;
import net.adhi.servicce.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String studentHomepage(Model model) {
		model.addAttribute("listStudents", service.getAllStudents());
		
		return "index";		
	}
	@GetMapping("/NewForm")
	public String newStudentForm(Model model) {
		Student student=new Student();
		model.addAttribute("student", student);
		return "new_student";
	}
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute Student student)
	{
		service.saveStudent(student);
		return "redirect:/";
				
	}
	@GetMapping("/update/{id}")
	public String StudentupdateForm(@PathVariable("id") long id,Model model) {
		
		Student student =service.getStudentById(id);
		model.addAttribute("student", student);
		return "update_Student";
		
	}
	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable("id") long id) {
		
		//call the delete method
		this.service.deleteStudent(id);
		return "redirect:/";
	}
}
