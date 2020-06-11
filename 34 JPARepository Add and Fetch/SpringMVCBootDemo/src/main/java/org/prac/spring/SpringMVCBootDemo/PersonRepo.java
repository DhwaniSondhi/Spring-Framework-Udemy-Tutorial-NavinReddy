package org.prac.spring.SpringMVCBootDemo;

import java.util.List;

import org.prac.spring.SpringMVCBootDemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Integer> {

	List<Person> findByNameOrderByIdDesc(String name);
}
