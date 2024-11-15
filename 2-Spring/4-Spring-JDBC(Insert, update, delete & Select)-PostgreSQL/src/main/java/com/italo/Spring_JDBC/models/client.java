package com.italo.Spring_JDBC.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class client {
    private int clientId;
    private String name;
    private int age;

    public client() {
        System.out.println("client created...");
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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

    @Override
    public String toString() {
        return "client{" +
                "clientId=" + clientId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
