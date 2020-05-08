package org.practice.spring.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Person p1=(Person) context.getBean("person"); 
		Person p2=(Person) context.getBean("person"); 
		System.out.println(p1==p2);
    }
}
