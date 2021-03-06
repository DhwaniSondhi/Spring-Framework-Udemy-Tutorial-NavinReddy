package org.prac.spring.SpringMVCBootDemo;

import java.util.List;

import org.prac.spring.SpringMVCBootDemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	PersonRepo pRepo;
	
	@GetMapping(path="/persons", produces= {"application/xml"})
	public List<Person> getPersons(){
		int i = 10 / 0;
		return pRepo.findAll();
	}
	
	@GetMapping("/person/{id}")
	public Person getPerson(@PathVariable("id")int id){
		return pRepo.findById(id).orElse(new Person.PersonBuilder().setId(0).setName("").build());
	}
	
	@PostMapping(path="/person", consumes= "application/xml")
	public Person addPerson(@RequestBody Person p) {
		pRepo.save(p);
		return p;
	}
	
}
