package org.prac.spring.SpringMVCBootDemo;

import org.prac.spring.SpringMVCBootDemo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController  {

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
	public String addPerson(@RequestParam("id") int id,@RequestParam("name") String name, Model model) {
		Person p=new Person.PersonBuilder().setId(id).setName(name).build();
		model.addAttribute("person",
							new Person
								.PersonBuilder()
								.setId(id)
								.setName(name)
								.build());
		return "resultPerson";
	}
}
