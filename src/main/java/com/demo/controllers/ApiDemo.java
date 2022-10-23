package com.demo.controllers;

import com.demo.model.Person;
import com.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.GregorianCalendar;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class ApiDemo {

    @Autowired
    PersonService personService;
    GregorianCalendar calendar = new GregorianCalendar();

    @GetMapping("/all")
    public ArrayList<Person> getAllPersons(){
        return personService.getAllPersons();
    }

    @PostMapping("/save")
    public Person savePerson(@RequestBody Person p){
        return personService.savePerson(p);
    }

    @GetMapping("/saludar")
    public String saludar(){
        return "prueba";
    }

    @GetMapping("/leap/{birth}")
    public Boolean leap(@PathVariable Integer birth){
        return personService.leap(birth);
    }
}
