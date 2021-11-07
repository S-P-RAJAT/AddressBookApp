package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.exceptions.AddressBookException;
import com.bridgelabz.addressbookapp.model.Contact;

import org.springframework.stereotype.Service;

@Service
public class AddressBookService implements IAddressBookService {

    List<Contact> contactList = new ArrayList<>();

    @Override
    public List<Contact> getContact() 
    {
        return contactList;
    }

    @Override
    public Contact getContactById(int contactId) 
    {
    	return contactList.stream()
 			   .filter(contact->contact.getContactId()==contactId)
 			   .findFirst()
 			   .orElseThrow(()->new AddressBookException("Contact not found"));    }

    @Override
    public Contact createContact(ContactDTO contactDTO) 
    {
        Contact contact = new Contact(contactList.size()+1,contactDTO);
        contactList.add(contact);
        return contact;

    }

    @Override
    public Contact updateContact(int contactId, ContactDTO contactDTO) 
    {
        Contact contact = this.getContactById(contactId);
        contact.setFirstName(contactDTO.firstName);
        contact.setAddress(contactDTO.address);
        contactList.set(contactId-1,contact);
        return contact;
    }

    @Override
    public void deleteContact(int contactId) 
    {
        contactList.remove(contactId-1);   
        
    }
}