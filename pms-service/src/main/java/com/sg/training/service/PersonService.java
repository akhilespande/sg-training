package com.sg.training.service;

import com.sg.training.model.Person;

import java.util.List;

public interface PersonService {
    Integer addPerson(Person person);
    Integer modifyPersonById(Person person);
    Integer deletePersonById(Integer id);
    List<Person> getPersons();
    Person getPersonById(Integer id);
}
