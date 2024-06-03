package com.sg.training.hms.repository;

import com.sg.training.hms.model.Patient;

public interface PatientRepository {
    Integer addPatient(Patient patient);
    Patient getPatientById(Integer id);
}
