package org.prac.spring.SpringMVCBootDemo;

import java.util.List;

import org.prac.spring.SpringMVCBootDemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	PersonRepo pRepo;
	
	@GetMapping("/persons")
	public List<Person> getPersons(){
		return pRepo.findAll();
	}
	
	@GetMapping("/person/{id}")
	public Person getPerson(@PathVariable("id")int id){
		return pRepo.findById(id).orElse(new Person.PersonBuilder().setId(0).setName("").build());
	}
	
	@PostMapping("/person")
	public Person addPerson(@RequestBody Person p) {
		pRepo.save(p);
		return p;
	}
	
}
