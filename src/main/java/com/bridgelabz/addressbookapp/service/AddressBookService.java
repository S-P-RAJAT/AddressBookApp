package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.model.Contact;

import org.springframework.stereotype.Service;

@Service
public class AddressBookService implements IAddressBookService {

	@Override
	public List<Contact> getContact() {
		List<Contact> contactList = new ArrayList<>();
		contactList.add(new Contact(1, new ContactDTO("Rahul","Chaturvedi","Hosa Road, Electronic City")));
		return contactList;
	}

	@Override
	public Contact getContactById(int contactId) {
		Contact contact = new Contact(1, new ContactDTO("Rahul","Chaturvedi","Hosa Road, Electronic City"));
		return contact;
	}

	@Override
	public Contact createContact(ContactDTO contactDTO) {
		Contact contact = new Contact(1, contactDTO);
		return contact;
	}

	@Override
	public Contact updateContact(int contactId, ContactDTO contactDTO) {
		Contact contact = new Contact(1, contactDTO);
		return contact;
	}

	@Override
	public void deleteContact(int contactId) {

	}
}