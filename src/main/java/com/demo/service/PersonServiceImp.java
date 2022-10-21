package com.demo.service;

import com.demo.model.Person;
import com.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonServiceImp implements PersonService{

    @Autowired
    PersonRepository personRepository;

    @Override
    public ArrayList<Person> getAllPersons() {
        return (ArrayList<Person>) personRepository.findAll();
    }

    @Override
    public Person savePerson(Person p) {
        return personRepository.save(p);
    }
}
