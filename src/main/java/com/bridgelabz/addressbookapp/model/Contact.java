package com.bridgelabz.addressbookapp.model;


import com.bridgelabz.addressbookapp.dto.ContactDTO;

import lombok.Data;

public @Data class Contact 
{
	private int contactId;
	private String firstName;
	private String lastName;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    
    public Contact() {
    	
    }
    
	public Contact(int contactId, ContactDTO contactDTO) {
		super();
		this.contactId = contactId;
		this.firstName= contactDTO.firstName;
		this.lastName= contactDTO.lastName;
		this.phoneNumber = contactDTO.phoneNumber;
		this.address = contactDTO.address;
		this.city = contactDTO.city;
		this.state = contactDTO.state;
		this.zip = contactDTO.zip;
		this.email = contactDTO.email;
	}
    
    

}