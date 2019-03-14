package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.PartnerDriver;
import com.example.demo.repos.DriverRepository;

@Controller
public class PartnerDriverController {
	
	@Autowired
	private PartnerDriver cabDriver;	
	@Autowired
	private ModelAndView mdlview; 
	@Autowired
	private DriverRepository repo;
	
	@GetMapping("/")
	public String init() {
		return "index";
	}
	
	@GetMapping("/addDriver")
	public ModelAndView sendForm() {
		mdlview.addObject("command",cabDriver);
		mdlview.setViewName("addCabDriver");
		return mdlview;
	}
	
	@PostMapping("/addDriver")
	public String OnSubmit(@ModelAttribute("addedBean")PartnerDriver newDriver) {
	 PartnerDriver response =repo.save(newDriver);
		if(response != null)
			return "success";
		else
			return "failure";
	}

}
