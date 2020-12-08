package com.udemy.rabbitmq.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Student implements Serializable {

    private int age;

    private String name;


    private String firstname;

    @JsonProperty("age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @JsonProperty("firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }

}
