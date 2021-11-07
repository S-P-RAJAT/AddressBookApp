package com.bridgelabz.addressbookapp.model;


import com.bridgelabz.addressbookapp.dto.ContactDTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "contact")
public @Data class Contact 
{
	@Id
	@Column(name = "contact_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
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
		this.updateContact(contactDTO);
		
	}
	public void updateContact(ContactDTO contactDTO) {
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