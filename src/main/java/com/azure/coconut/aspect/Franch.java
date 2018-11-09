package com.azure.coconut.aspect;

import org.springframework.stereotype.Component;

@Component
public class Franch implements Person {
    @Override
    public void sayHello() {
        System.out.println("Bonjour a tous les monde!");
    }
}
