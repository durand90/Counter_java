package com.fanfan.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		session.setAttribute("count", 0);
		return "display.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Integer onCount = (Integer) session.getAttribute("count");
		onCount++;
		session.setAttribute("count", onCount);
		model.addAttribute("number", onCount);
		return "counter.jsp";
	}

}
