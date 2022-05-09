package com.zohocrm.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Lead;
import com.zohocrm.repositories.LeadRepository;
import com.zohocrm.services.LeadService;
import com.zohocrm.utilities.EmailService;

@Controller
public class EmailController {

	private static String to;
	private static long idnew;
	
	@Autowired
	private EmailService emailservice;
	
	@Autowired
	private LeadRepository leadrepo;
	
	@Autowired
	private LeadService leadservice;
	
	@RequestMapping("/compose")
	public String composeEmail(@RequestParam("emailId") String email,@RequestParam("id") long id,ModelMap map) {
		to=email;
		idnew=id;
		map.addAttribute("email", email);
		return "send_email";
	}
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("subject") String subject,@RequestParam("body")String body,ModelMap map) {
		emailservice.sendSimpleMessage(to,subject,body);
		map.addAttribute("msg", "Mail sent successfully");
		Lead lead = leadservice.findbyId(idnew);
		map.addAttribute("lead", lead);
		return "lead_info";
	}
}
