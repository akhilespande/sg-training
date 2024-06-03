package com.sg.training.repository.impl;

import com.sg.training.model.Person;
import com.sg.training.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public PersonRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Integer createPerson(Person person) {
     final String CREATE_PERSON = "INSERT INTO PERSON VALUES(?,?,?,?)";
     int count = jdbcTemplate.update(CREATE_PERSON, person.getId(), person.getFirstName(), person.getLastName(), person.getAge());
     return count;
    }

    @Override
    public Integer updatePersonById(Person person) {
        return 0;
    }

    @Override
    public Integer deletePeronById(Integer id) {
        return 0;
    }

    @Override
    public List<Person> getAllPerson() {
        return null;
    }

    @Override
    public Person getPersonById(Integer id) {
        return null;
    }
}
