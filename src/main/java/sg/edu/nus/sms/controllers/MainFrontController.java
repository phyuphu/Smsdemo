package sg.edu.nus.sms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;

import sg.edu.nus.sms.models.UserSession;

@Controller
public class MainFrontController {
	
	@GetMapping("/home")
	public String getHome() {
		return "index";
	}
	
	@GetMapping("/studentlogin")
	public String getStudentLoginPage(Model model) {
		model.addAttribute("user", new UserSession());
		return "stulogin";
	}
	
	
	@PostMapping("/studentAuthenticate")
	public String getStudentAuthentication(@ModelAttribute("user") UserSession user, BindingResult bindingResult) {
		if (user.getName().equalsIgnoreCase("dilbert"))
			return "redirect:/copygrades";
		else 
		return "stulogin";
	}
	
	@GetMapping("/admlogin")
	public String getLoginPage(Model model) {
		model.addAttribute("adminuser", new UserSession());
		return "adminlogin";
	}
	
	@GetMapping("/logout")
	public String getLogoutPage(SessionStatus status) {
		status.setComplete();
		return "index";
	}
	
	@PostMapping("/adminAuthenticate")
	public String getAuthentication(@ModelAttribute("adminuser") UserSession user, BindingResult bindingResult) {
		if (user.getName().equalsIgnoreCase("dilbert"))
			return "redirect:/pending";
		else 
		return "adminlogin";
	}
	
	@GetMapping("/falogin")
	public String getFacultyLoginPage(Model model) {
		model.addAttribute("facultyuser", new UserSession());
		return "facultylogin";
	}
	@PostMapping("/facultyAuthenticate")
	public String getFacultyAuthentication(@ModelAttribute("facultyuser") UserSession user, BindingResult bindingResult) {
		if (user.getName().equalsIgnoreCase("dilbert"))
			return "redirect:/masterlist";
		else 
		return "facultylogin";
	}
	
	
}
