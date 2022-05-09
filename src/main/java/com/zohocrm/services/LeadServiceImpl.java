package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Lead;
import com.zohocrm.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadrepo;
	
	@Override
	public Exception saveOneLead(Lead lead) {
		try {
		leadrepo.save(lead);
		return null;
		}catch(ConstraintViolationException e) {
			return e;
		}
	}

	@Override
	public Lead findbyId(long idnew) {
		Optional<Lead> findById = leadrepo.findById(idnew);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteById(long id) {
		leadrepo.deleteById(id);
	}

	@Override
	public List<Lead> listAllLeads() {
		List<Lead> leads = leadrepo.findAll();
		return leads;
	}

	@Override
	public Lead getLeadInfo(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

}
