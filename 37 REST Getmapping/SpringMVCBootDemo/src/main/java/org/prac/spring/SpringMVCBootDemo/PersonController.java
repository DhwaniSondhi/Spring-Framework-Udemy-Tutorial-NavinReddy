package org.prac.spring.SpringMVCBootDemo;

import java.util.List;

import org.prac.spring.SpringMVCBootDemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonController {

	@Autowired
	PersonRepo pRepo;
	
	@GetMapping("/persons")
	@ResponseBody
	public List<Person> getPersons(){
		return pRepo.findAll();
	}
	
}
