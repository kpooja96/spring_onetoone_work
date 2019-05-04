package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Person;
import com.capgemini.model.Profile;
import com.capgemini.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService service;

	@RequestMapping("/")
	public void setPerson() {
		Person person = new Person(101,"Pooja", new Profile(201, "java"));
		service.save(person);
		
	}

	@RequestMapping("/new")
	public Person getPerson() {
	Person person = service.findById(101).get();
		return person;
	}

}
