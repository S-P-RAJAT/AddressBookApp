package com.bridgelabz.addressbookapp.controller;

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
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = { "", "/", "/get" })
	public String addressBook() {
		return String.format(template, "World");
	}

	@GetMapping("/query")
	public String addressBook(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format(template, name);
	}


	@GetMapping("/param/{name}")
	public String addressBookParam(@PathVariable String name) {
		return String.format(template, name);
	}

	@PostMapping("/post")
	public String addressBook(@RequestBody ContactDTO contact) {

		return String.format(template, contact.getFirstName() + " " + contact.getLastName());
	}

	@PutMapping("put/{firstName}")
	public String addressBook(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {

		return String.format(template, firstName + " " + lastName);
	}
}
