package com.sg.training.hms.model;

public class Patient {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    Integer id;

    public Patient(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    String name;
    Integer age;
}
