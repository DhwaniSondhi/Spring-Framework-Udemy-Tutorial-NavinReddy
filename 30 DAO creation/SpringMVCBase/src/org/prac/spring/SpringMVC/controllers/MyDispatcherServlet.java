package org.prac.spring.SpringMVC.controllers;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.jdbc.Driver;

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
	public ComboPooledDataSource dataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource=new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/practice");
		dataSource.setUser("root");
		dataSource.setPassword("root");
		dataSource.setMinPoolSize(5);
		dataSource.setMaxPoolSize(10);
		dataSource.setMaxIdleTime(30000);
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
		HibernateTransactionManager tx=null;
		try {
			tx=new HibernateTransactionManager();
			tx.setSessionFactory(sessionFactory().getObject());
		}catch (Exception e) {
			e.printStackTrace();
		}
		return tx;
	}
}
