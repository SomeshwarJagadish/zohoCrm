package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Bills;

public interface BillsService {

	void saveOneBilling(Bills bill);

	List<Bills> listAllBillings();

}
