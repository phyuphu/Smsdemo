package sg.edu.nus.sms.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;

import sg.edu.nus.sms.models.Student;
import sg.edu.nus.sms.repo.AdminRepository;
import sg.edu.nus.sms.repo.StudentRepository;

@Controller
public class AdminController {
	@Autowired
	AdminRepository arepo;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		//binder.addValidators(new ProductValidator());
	}
	
	@GetMapping("/pending")
	public String listCourse(Model model){
		//
		return "pending";
	}

}
