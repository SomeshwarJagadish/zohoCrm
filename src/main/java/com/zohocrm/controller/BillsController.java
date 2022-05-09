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
import com.zohocrm.services.BillsService;
import com.zohocrm.services.ContactsService;


@Controller
public class BillsController {

	@Autowired
	private BillsService billingService;
	
	@Autowired
	private ContactsService contactsService;
	
	@RequestMapping("/billingPage")
	public String billing(@ModelAttribute("Bills") Bills bill,ModelMap map) {
		billingService.saveOneBilling(bill);
		List<Bills> bills = billingService.listAllBillings();
		map.addAttribute("bills", bills);
		return "billing_details";
	}
	
	@RequestMapping("/listAllBilling")
	public String listAllBilling(ModelMap map) {
		List<Bills> bills = billingService.listAllBillings();
		map.addAttribute("bills", bills);
		return "billing_details";
	}
	
}
