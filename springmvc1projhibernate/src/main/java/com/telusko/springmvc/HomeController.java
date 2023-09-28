package com.telusko.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.springmvc.dao.AlienDao;
import com.telusko.springmvc.model.Alien;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired
	private AlienDao dao;
	@ModelAttribute   
	public void modelData(ModelMap m)
	{
		m.addAttribute("name","Aliens");
	}
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute("result") Alien a)
	{
		dao.addAlien(a);
		return "showAliens";
		
	}
	@GetMapping("getAliens")
	public String getAliens(ModelMap m)
	{
	m.addAttribute("result",dao.getAliens());
	return "showAliens";
	}
	@GetMapping("getAlien")
	public String getAlien(@RequestParam int aid,ModelMap m)
	{
	m.addAttribute("result",dao.getAlien(aid));
	return "showAliens";
	}
	
	
}
	