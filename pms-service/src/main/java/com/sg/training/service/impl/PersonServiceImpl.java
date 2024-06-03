package com.sg.training.service.impl;

import com.sg.training.model.Person;
import com.sg.training.repository.PersonRepository;
import com.sg.training.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public Integer addPerson(Person person) {
        return personRepository.createPerson(person);
    }

    @Override
    public Integer modifyPersonById(Person person) {
        return 0;
    }

    @Override
    public Integer deletePersonById(Integer id) {
        return 0;
    }

    @Override
    public List<Person> getPersons() {
        return null;
    }

    @Override
    public Person getPersonById(Integer id) {
        return null;
    }
}
