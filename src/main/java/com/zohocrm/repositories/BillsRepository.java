package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Bills;

public interface BillsRepository extends JpaRepository<Bills, Long> {

}
