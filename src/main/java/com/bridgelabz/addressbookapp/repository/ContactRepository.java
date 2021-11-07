package com.bridgelabz.addressbookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.addressbookapp.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}