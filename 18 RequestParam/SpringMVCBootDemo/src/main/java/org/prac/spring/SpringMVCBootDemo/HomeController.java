package org.prac.spring.SpringMVCBootDemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController  {

	@RequestMapping("/")
	public String home() {
		System.out.println("Home Page requested");
		return "index";
	}
	
	@RequestMapping("/add")
	public String add(@RequestParam("t1") int t1,@RequestParam("t2") int t2,  HttpSession session) {
		System.out.println("Result: "+(t1+t2));
		session.setAttribute("res", t1+t2);
		return "result";
	}
}
