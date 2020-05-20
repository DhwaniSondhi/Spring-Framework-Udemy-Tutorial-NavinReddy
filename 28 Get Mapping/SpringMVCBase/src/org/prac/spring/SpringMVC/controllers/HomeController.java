package org.prac.spring.SpringMVC.controllers;

import java.util.ArrayList;
import java.util.List;

import org.prac.spring.SpringMVC.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController  {

	@RequestMapping("/")
	public String home() {
		System.out.println("Home Page requested");
		return "personEntry";
	}
	
	@PostMapping("/add")
	public String add(@RequestParam("t1") int t1,@RequestParam("t2") int t2, Model model) {
		model.addAttribute("res",t1+t2);
		return "result";
	}
	@PostMapping("/addPerson")
	public String addPerson(@ModelAttribute("person") Person p, Model model) {
		return "resultPerson";
	}
	
	@GetMapping("/getPersons")
	public String getPersons(Model model) {
		List<Person> pList=new ArrayList<>();
		pList.add(new Person.PersonBuilder().setId(1).setName("Dhwani").build());
		pList.add(new Person.PersonBuilder().setId(2).setName("Tej").build());
		pList.add(new Person.PersonBuilder().setId(3).setName("Sahaj").build());
		model.addAttribute("persons",pList);
		return "showPersons";
	}

	@ModelAttribute
	public void modelData(Model model) {
		model.addAttribute("name", "Developers");
	}
}
