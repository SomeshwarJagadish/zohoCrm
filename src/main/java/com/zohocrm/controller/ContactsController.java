package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Bills;
import com.zohocrm.entities.Contacts;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.BillsService;
import com.zohocrm.services.ContactsService;
import com.zohocrm.services.LeadService;

@Controller
public class ContactsController {

	@Autowired
	private LeadService leadservice;
	
	@Autowired
	private ContactsService contactservice;
	
	@Autowired
	private ContactsService contactsservice;
	
	@Autowired
	private BillsService billingService;
	
	@RequestMapping("/convert")
	public String convert(@RequestParam("id") long id,@ModelAttribute("Contacts") Contacts contacts,ModelMap map) {
		contactsservice.saveOneContacts(contacts);
		leadservice.deleteById(id);
		List<Contacts> contact = contactservice.getContactInfo();
		map.addAttribute("contact", contact);
		return "contacts";
	}
	
	@RequestMapping("/listAllContacts")
	public String listAllContacts(ModelMap map) {
		List<Contacts> contact = contactservice.getContactInfo();
		map.addAttribute("contact", contact);
		return "contacts";
	}
	
	@RequestMapping("/getcontactInfo")
	public String getcontactInfo(@RequestParam("id") long id,ModelMap map) {
		 Contacts contact = contactservice.getcontactInfo(id);
		map.addAttribute("contact", contact);
		return "contact_info";
	}
	
	@RequestMapping("/editContact")
	public String edit(@RequestParam("id") long id,ModelMap map) {
		Contacts contact = contactservice.getcontactInfo(id);
		map.addAttribute("contact", contact);
		return "edit_contact_info";
	}
	
	@RequestMapping("/editContactInfo")
	public String editInfo(Contacts contacts,ModelMap map) {
		contactsservice.saveOneContacts(contacts);
		List<Contacts> contact = contactservice.getContactInfo();
		map.addAttribute("contact", contact);
		return "contacts";
	}
	
	@RequestMapping("/billing")
	public String billing(@RequestParam("id") long id,ModelMap map) {
		Contacts contact = contactservice.getcontactInfo(id);
		map.addAttribute("contact", contact);
		return "billing";
	}
	
	
}
