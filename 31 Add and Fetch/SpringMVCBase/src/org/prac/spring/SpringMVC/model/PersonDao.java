package org.prac.spring.SpringMVC.model;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Repository
public class PersonDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Person> getPersons(){
		Session session=sessionFactory.openSession();
		List<Person> persons=session.createQuery("from Person",Person.class).list();
		return persons;
	}
	
	public void addPerson(Person p) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		System.out.println("saving: "+p.getId());
		session.save(p);
		session.getTransaction().commit();
	}
	
	@Transactional
	public Person getPerson(int id){
		Session session=sessionFactory.openSession();
		return (Person) session.get(Person.class,id);
	}
}
