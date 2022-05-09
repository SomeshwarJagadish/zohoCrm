package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm.entities.Contacts;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts, Long> {

}
