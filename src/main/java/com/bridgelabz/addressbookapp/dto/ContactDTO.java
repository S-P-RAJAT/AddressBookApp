package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class ContactDTO {

	@NotEmpty(message = "First Name cannot be null")
	@Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$",message = "First Name Invalid")
    public String firstName;
	
	@NotEmpty(message = "Last Name cannot be null")
	@Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$",message = "Last Name Invalid")
    public String lastName;
	
	@NotEmpty(message = "phone number cannot be null")
	@Pattern(regexp = "^([+]\\d{1,3})? ?\\d{10}$",message = "Phone number Invalid")
	public String phoneNumber;
	
	@NotEmpty(message = "Address cannot be null")
	@Pattern(regexp = "^[A-Z,a-z,0-9, ()#-]{3,}$", message = "Address Invalid")
    public String address;
	public String city;
	public String state;

	@NotEmpty(message = "Zip cannot be null")
	@Pattern(regexp = "^[0-9]{3}[ ]?[0-9]{3}$",message = "Zip Invalid")
	public String zip;
	
	@NotEmpty(message = "Email cannot be null")
	@Pattern(regexp = "^[a-z]+([.]?[a-z0-9_+-]+)?@[a-z1-9]+[.][a-z]{2,}([.][a-z]{2,})?$", message = "Email Invalid")
	public String email;

	public ContactDTO(String firstName, String lastName, String address, String phoneNumber, String city,String state, String zip) 
	{
		this.firstName= firstName;
		this.lastName= lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
}
