package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.model.Contact;
import com.bridgelabz.addressbookapp.repository.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressBookService implements IAddressBookService {

	@Autowired
	private ContactRepository contactRepository;
	
    @Override
    public List<Contact> getContact() 
    {
		return contactRepository.findAll();
    }

    @Override
    public Contact getContactById(int contactId) 
    {
		return contactRepository.findById(contactId).orElseThrow(() -> new AddressBookException("Contact not found"));
    }

    @Override
    public Contact createContact(ContactDTO contactDTO) 
    {
    	Contact contact = new Contact(contactDTO);
		return contactRepository.save(contact);
    }

    @Override
    public Contact updateContact(int contactId, ContactDTO contactDTO) 
    {
    	Contact contact = contactRepository.findById(contactId)
				.orElseThrow(() -> new AddressBookException("Contact not found"));
    	contact.updateContact(contactDTO);
		return contactRepository.save(contact);
    }

    @Override
    public void deleteContact(int contactId) 
    {
    	contactRepository.findById(contactId).orElseThrow(() -> new AddressBookException("Contact not found"));
		contactRepository.deleteById(contactId);        
    }
}