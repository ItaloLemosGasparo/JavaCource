package com.italo.Spring_Boot_Tests.models;


import org.springframework.beans.factory.annotation.Value;

public class person {
    @Value("Italo")
    private String name;
    @Value("23")
    private int age;
    @Value("M")
    private char gender;

    public person() {
        System.out.println("person created...");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
