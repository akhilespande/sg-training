package com.sg.training.repository;

import com.sg.training.model.Person;

import java.util.List;

public interface PersonRepository {
    Integer createPerson(Person person);
    Integer updatePersonById(Person person);
    Integer deletePeronById(Integer id);
    List<Person> getAllPerson();
    Person getPersonById(Integer id);
}
