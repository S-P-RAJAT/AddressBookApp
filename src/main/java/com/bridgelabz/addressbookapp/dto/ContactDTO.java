package com.bridgelabz.addressbookapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class ContactDTO {

	@NotEmpty(message = "Name cannot be null")
	@Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$",message = "Name Invalid")
    public String name;
	
	@NotEmpty(message = "Address cannot be null")
	@Pattern(regexp = "^[A-Z,a-z,0-9, ()#-]{3,}$", message = "Address Invalid")
    public String address;

	@NotEmpty(message = "phone number cannot be null")
	@Pattern(regexp = "^[+]?[91]{2}[ ]?[6-9][0-9]{9}$",message = "Phone number Invalid")
	public String phoneNumber;

	public String city;
	public String state;

	@NotEmpty(message = "zip cannot be null")
	@Pattern(regexp = "[0-9]{3}[ ]?[0-9]{3}$",message = "Zip Invalid")
	public String zip;

	public ContactDTO( String name, String address, String phoneNumber, String city,String state, String zip) 
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() 
	{
		return "ContactDTO [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + "]";
	}
}
