package org.prac.spring.SpringMVC;

import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

import org.prac.spring.SpringMVC.controllers.MyDispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitiater extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {MyDispatcherServlet.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
