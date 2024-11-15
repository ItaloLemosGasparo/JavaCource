package com.italo.Spring_Boot_Tests.models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class desktop implements computer {
    public void compile(){
        System.out.println("Compiling...");
    }

    public desktop() {
        System.out.println("desktop created...");
    }
}
