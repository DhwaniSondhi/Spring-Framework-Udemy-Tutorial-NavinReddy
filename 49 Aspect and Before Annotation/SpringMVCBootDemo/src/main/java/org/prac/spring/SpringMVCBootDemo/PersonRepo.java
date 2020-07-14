package org.prac.spring.SpringMVCBootDemo;

import java.util.List;

import org.prac.spring.SpringMVCBootDemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepo extends JpaRepository<Person, Integer> {

	@Query("from Person where name=:n")
	List<Person> find(@Param("n")String name);
}
