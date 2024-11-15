package com.Italo.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    @Autowired
    fuel fuel;

    public void start(){
        fuel.inject();

        System.out.println("Starting...");
    }
}
