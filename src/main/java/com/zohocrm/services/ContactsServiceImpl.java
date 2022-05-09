package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contacts;
import com.zohocrm.repositories.ContactsRepository;

@Service
public class ContactsServiceImpl implements ContactsService {

	@Autowired
	private ContactsRepository contactsrepo;
	
	@Override
	public void saveOneContacts(Contacts contacts) {
		contactsrepo.save(contacts);
	}

	@Override
	public List<Contacts> getContactInfo() {
		List<Contacts> contact = contactsrepo.findAll();
		return contact;
	}

	@Override
	public Contacts getcontactInfo(long id) {
		Optional<Contacts> findById = contactsrepo.findById(id);
		Contacts contact = findById.get();
		return contact;
	}

	@Override
	public void deleteOneContact(long id) {
		contactsrepo.deleteById(id);
		
	}

}
