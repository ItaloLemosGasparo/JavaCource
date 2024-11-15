package com.italo.Spring_Boot_Tests.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class developer extends person{
    public computer comp;

    public developer() {
        System.out.println("developer created...");
    }

    public computer getComp() {
        return comp;
    }

    @Autowired
    public void setComp(computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding...");
    }

}

