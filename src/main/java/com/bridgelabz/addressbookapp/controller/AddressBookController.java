package com.bridgelabz.addressbookapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<String> getContactData() {
		return new ResponseEntity<String>("Get call success", HttpStatus.OK);
	}

	@GetMapping("/get/{contactId}")
	public ResponseEntity<String> getContactData(@PathVariable("contactId") int contactId) {
		return new ResponseEntity<String>("Get call success for id", HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<String> addContactData(@RequestBody ContactDTO contactDTO) {
		return new ResponseEntity<String>("Created contact data for " + contactDTO, HttpStatus.OK);
	}
}
