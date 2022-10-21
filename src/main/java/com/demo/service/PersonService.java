package com.demo.service;

import com.demo.model.Person;

import java.util.ArrayList;

public interface PersonService {

    ArrayList<Person> getAllPersons();
    Person savePerson(Person p);

}
