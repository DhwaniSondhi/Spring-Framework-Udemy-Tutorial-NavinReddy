package org.prac.spring.SpringMVCBootDemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController  {

	@RequestMapping("/")
	public String home() {
		System.out.println("Home Page requested");
		return "index";
	}
	
	@RequestMapping("/add")
	public String add(HttpServletRequest req, HttpServletResponse resp) {
		int t1=Integer.parseInt(req.getParameter("t1"));
		int t2=Integer.parseInt(req.getParameter("t2"));
		System.out.println("Result: "+(t1+t2));
		HttpSession session=req.getSession();
		session.setAttribute("res", t1+t2);
		return "result";
	}
}
