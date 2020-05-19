package org.practice.spring.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Person p1=(Person) context.getBean("person"); 
		p1.run();
		System.out.println(p1.getAge());
		Person p2=(Person) context.getBean("person"); 
		System.out.println(p1==p2);
    }
}
