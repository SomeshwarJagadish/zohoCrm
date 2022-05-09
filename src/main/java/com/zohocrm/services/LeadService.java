package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {

	Exception saveOneLead(Lead lead);

	Lead findbyId(long idnew);

	void deleteById(long id);

	List<Lead> listAllLeads();

	Lead getLeadInfo(long id);

}
