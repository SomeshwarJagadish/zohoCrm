package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contacts;

public interface ContactsService {

	void saveOneContacts(Contacts contacts);

	public List<Contacts> getContactInfo();

	Contacts getcontactInfo(long id);

	void deleteOneContact(long id);

}
