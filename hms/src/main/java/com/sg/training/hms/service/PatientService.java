package com.sg.training.hms.service;

import com.sg.training.hms.model.Patient;

public interface PatientService {

    Integer addPatient(Patient patient);
    Patient getPatientById(Integer id);
}
