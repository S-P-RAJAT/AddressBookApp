package com.bridgelabz.addressbookapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.ContactDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.Contact;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<ResponseDTO> getContactData() {
		Contact contact = new Contact(1, new ContactDTO("Rahul", "Chaturvedi", "Hosa Road, Electronic City"));
		ResponseDTO response = new ResponseDTO("Get Call Successful", contact);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

	}

	@GetMapping("/get/{contactId}")
	public ResponseEntity<ResponseDTO> getContactData(@PathVariable("contactId") int contactId) {
		Contact contact = new Contact(1, new ContactDTO("Ted", "Mosby", "Abc street,12th cross"));
		ResponseDTO response = new ResponseDTO("Get Call For Id Successful", contact);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addContactData(@RequestBody ContactDTO contactDTO) {
		Contact contact = new Contact(1, contactDTO);
		ResponseDTO response = new ResponseDTO("Created Contact data Successfully", contact);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

	}

	@PutMapping("/update/{contactId}")
	public ResponseEntity<ResponseDTO> updateContactData(@PathVariable("contactId") int contactId,
			@RequestBody ContactDTO contactDTO) {
		Contact contact = new Contact(1, contactDTO);
		ResponseDTO response = new ResponseDTO("Updated Contact data Successfully", contact);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

	}

	@DeleteMapping("/delete/{contactId}")
	public ResponseEntity<ResponseDTO> deleteContactData(@PathVariable("contactId") int contactId) {
		ResponseDTO response = new ResponseDTO("Deleted Successfully", "deleted id:" + contactId);
		return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

	}
}
