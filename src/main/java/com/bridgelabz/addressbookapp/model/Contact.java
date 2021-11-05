package com.bridgelabz.addressbookapp.model;


import com.bridgelabz.addressbookapp.dto.ContactDTO;

public class Contact 
{
	private int contactId;
	private String firstName;
    private String lastName;
    private String address;
    
	public Contact(int contactId,ContactDTO contactDTO) 
	{
		this.contactId = contactId;
		this.firstName = contactDTO.firstName;
		this.lastName = contactDTO.lastName;
		this.address = contactDTO.address;
	}
	public int getContactId() 
	{
		return contactId;
	}
	public void setContactId(int contactId) 
	{
		this.contactId = contactId;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
    
    

}