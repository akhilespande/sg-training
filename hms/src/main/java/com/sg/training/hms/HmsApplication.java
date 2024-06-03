package com.sg.training.hms;

import com.sg.training.hms.model.Patient;
import com.sg.training.hms.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class HmsApplication {

	private static final Logger log = LoggerFactory.getLogger(HmsApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(HmsApplication.class, args);
		PatientService patientService = applicationContext.getBean(PatientService.class);
		Integer count = patientService.addPatient(new Patient(2,"Rama", 24));
		log.info(count+": rows inserted...");
	}

}
