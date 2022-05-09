package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.repositories.BillsRepository;
import com.zohocrm.repositories.ContactsRepository;
import com.zohocrm.repositories.LeadRepository;

@Controller
public class MenuController {

	@Autowired
	LeadRepository leadrepo;
	
	@Autowired
	ContactsRepository contactsrepo;
	
	@Autowired
	BillsRepository billsrepo;
	
	@RequestMapping("/homePage")
	public String homePage(ModelMap map) {
		long leadsCount = leadrepo.count();
		long contactsCount = contactsrepo.count();
		long billsCount = billsrepo.count();
		map.addAttribute("leadscount", leadsCount);
		map.addAttribute("contactsCount", contactsCount);
		map.addAttribute("billsCount", billsCount);
		return "home";
	}
	
}
