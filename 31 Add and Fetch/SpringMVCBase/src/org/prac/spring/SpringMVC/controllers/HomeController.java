package org.prac.spring.SpringMVC.controllers;

import java.util.ArrayList;
import java.util.List;

import org.prac.spring.SpringMVC.model.Person;
import org.prac.spring.SpringMVC.model.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController  {

	@Autowired
	private PersonDao personDao;
	public PersonDao getPersonDao() {
		return personDao;
	}
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

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
		personDao.addPerson(p);
		model.addAttribute("persons",personDao.getPersons());
		return "showPersons";
	}
	
	@GetMapping("/getPersons")
	public String getPersons(Model model) {
		model.addAttribute("persons",personDao.getPersons());
		return "showPersons";
	}

	@ModelAttribute
	public void modelData(Model model) {
		model.addAttribute("name", "Developers");
	}
	
	@PostMapping("/getPerson")
	public String getPerson(@RequestParam("id") int id, Model model) {
		Person person = personDao.getPerson(id);
		model.addAttribute("person",person);
		return "resultPerson";
	}
}
