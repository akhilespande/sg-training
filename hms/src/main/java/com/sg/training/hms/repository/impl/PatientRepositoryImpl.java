package com.sg.training.hms.repository.impl;

import com.sg.training.hms.model.Patient;
import com.sg.training.hms.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PatientRepositoryImpl implements PatientRepository {
    private static final String INSERT_PATIENT = "INSERT INTO PATIENT VALUES(?,?,?)";

    @Autowired
    JdbcTemplate jdbcTemplate;

/*    @Autowired
    public PatientRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/

    @Override
    public Integer addPatient(Patient patient) {
       return jdbcTemplate.update(INSERT_PATIENT,patient.getId(),patient.getName(),patient.getAge());
    }

    @Override
    public Patient getPatientById(Integer id) {
        return null;
    }
}
