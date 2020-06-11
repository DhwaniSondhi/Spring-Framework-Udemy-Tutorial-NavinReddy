package org.prac.spring.SpringMVCBootDemo;

import org.prac.spring.SpringMVCBootDemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController  {

	@Autowired
	PersonRepo pRepo;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Home Page requested");
		return "personEntry";
	}
	
	@RequestMapping("/add")
	public String add(@RequestParam("t1") int t1,@RequestParam("t2") int t2, Model model) {
		model.addAttribute("res",t1+t2);
		return "result";
	}
	@RequestMapping("/addPerson")
	//Person person
	//@ModelAttribute Person person
	public String addPerson(@ModelAttribute("person") Person p, Model model) {
		return "resultPerson";
	}

	@ModelAttribute
	public void modelData(Model model) {
		model.addAttribute("name", "Developers");
	}
	
	@RequestMapping("/getPersons")
	public String getPersons(Model model) {
		model.addAttribute("res",pRepo.findAll());
		return "result";
	}
}
