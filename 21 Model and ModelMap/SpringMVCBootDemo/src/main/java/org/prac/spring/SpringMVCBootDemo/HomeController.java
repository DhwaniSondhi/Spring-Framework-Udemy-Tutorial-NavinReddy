package org.prac.spring.SpringMVCBootDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController  {

	@RequestMapping("/")
	public String home() {
		System.out.println("Home Page requested");
		return "index";
	}
	
	@RequestMapping("/add")
	public String add(@RequestParam("t1") int t1,@RequestParam("t2") int t2, Model model) {
		model.addAttribute("res",t1+t2);
		return "result";
	}
}
