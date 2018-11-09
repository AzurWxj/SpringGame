package com.azure.coconut.aspect;

public class FranchSayBye implements SayByeable {
    @Override
    public void sayBye() {
        System.out.println("Au revoir.");
    }
}
