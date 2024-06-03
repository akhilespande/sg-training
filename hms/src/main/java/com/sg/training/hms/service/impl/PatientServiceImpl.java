package com.sg.training.hms.service.impl;

import com.sg.training.hms.model.Patient;
import com.sg.training.hms.repository.PatientRepository;
import com.sg.training.hms.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Integer addPatient(Patient patient) {
        return patientRepository.addPatient(patient);
    }

    @Override
    public Patient getPatientById(Integer id) {
        return null;
    }
}
