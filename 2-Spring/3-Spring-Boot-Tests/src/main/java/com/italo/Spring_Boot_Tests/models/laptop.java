package com.italo.Spring_Boot_Tests.models;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class laptop implements computer {
    public void compile(){
        System.out.println("Compiling...");
    }

    public laptop() {
        System.out.println("laptop created...");
    }
}
