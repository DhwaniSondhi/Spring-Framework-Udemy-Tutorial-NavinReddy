package org.prac.spring.SpringMVCBootDemo;

import org.prac.spring.SpringMVCBootDemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
