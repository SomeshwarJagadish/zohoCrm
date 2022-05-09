package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Bills;
import com.zohocrm.repositories.BillsRepository;

@Service
public class BillsServiceImpl implements BillsService {
	
	@Autowired
	private BillsRepository billsRepo;

	@Override
	public void saveOneBilling(Bills bill) {
		billsRepo.save(bill);
		billsRepo.count();
	}

	@Override
	public List<Bills> listAllBillings() {
		List<Bills> bill = billsRepo.findAll();
		return bill;
	}

}
