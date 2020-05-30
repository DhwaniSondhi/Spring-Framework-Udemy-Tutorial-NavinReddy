package org.prac.spring.SpringMVC.controllers;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.apache.tomcat.dbcp.dbcp2.DataSourceConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan({"org.prac.spring.SpringMVC"})
@EnableTransactionManagement
public class MyDispatcherServlet {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver irvr=new InternalResourceViewResolver();
		irvr.setPrefix("/WEB-INF/pages/");
		irvr.setSuffix(".jsp");
		return irvr;
	}
	
	@Bean
	public DataSource dataSource() throws PropertyVetoException {
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/practice");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean("sessionFactory")
	public LocalSessionFactoryBean sessionFactory() throws PropertyVetoException {
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan("org.prac.spring.SpringMVC.model");
		Properties props=new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
		props.setProperty("hibernate.show_sql", "true");
		sessionFactory.setHibernateProperties(props);
		return sessionFactory;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager() {
		System.out.println("being called");
		HibernateTransactionManager tx=null;
		try {
			tx=new HibernateTransactionManager(sessionFactory().getObject());
		}catch (Exception e) {
			e.printStackTrace();
		}
		return tx;
	}
}
