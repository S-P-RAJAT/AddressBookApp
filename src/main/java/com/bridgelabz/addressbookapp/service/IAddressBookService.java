package com.bridgelabz.addressbookapp.service;

import java.util.List;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.model.Contact;



public interface IAddressBookService 
{
    List<Contact> getContact();
    Contact getContactById(int contactId);
    Contact createContact(ContactDTO contactDTO);
    Contact updateContact(int contactId,ContactDTO contactDTO);
    void deleteContact(int contactId);

}
