package com.sg.training;

import com.sg.training.config.DatabaseConfig;
import com.sg.training.model.Person;
import com.sg.training.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DatabaseConfig.class);
        PersonService personService = applicationContext.getBean(PersonService.class);
        Integer count = personService.addPerson(new Person(1,"John", "Smith", 24));
        System.out.println("No of rows inserted ... :"+count);
    }
}
