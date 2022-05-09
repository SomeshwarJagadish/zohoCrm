package com.zohocrm.controller;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contacts;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactsService;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadservice;
	
	
	
	@RequestMapping("/lead")
	public String lead() {
		return "create_lead";
	}
	
	@RequestMapping("/leadPage")
	public String leadPage(@ModelAttribute("lead") Lead lead,ModelMap map) {
		Exception e = leadservice.saveOneLead(lead);
		if(e!=null) {
		map.addAttribute("msg","Email Id/Phone number Exist");
		return "create_lead";
		}else {
		map.addAttribute("lead", lead);
		return "lead_info";
		}
	}
	
	@RequestMapping("/listAllLeads")
	public String listAllLeads(ModelMap map) {
		List<Lead> leads = leadservice.listAllLeads();
		map.addAttribute("lead", leads);
		return "leads";
	}
	
	@RequestMapping("/getLeadInfo")
	public String getLeadInfo(@RequestParam("id") long id,ModelMap map) {
		Lead lead = leadservice.getLeadInfo(id);
		map.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam("id") long id,ModelMap map) {
		Lead lead = leadservice.getLeadInfo(id);
		map.addAttribute("lead", lead);
		return "edit_info";
	}
	
	@RequestMapping("/editInfo")
	public String editInfo(Lead lead,ModelMap map) {
		leadservice.saveOneLead(lead);
		map.addAttribute("lead", lead);
		List<Lead> leads = leadservice.listAllLeads();
		map.addAttribute("lead", leads);
		return "leads";
	}
	
}
