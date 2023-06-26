package com.java11;

public class TestClassWithNonFinction {

    public static void main(String[] args) {

        NonMyFunction function =  (firstName, lastname) ->{
            return firstName + "-" + lastname;
        };
        System.out.println(function.contactName("Selva", "Sun"));
    }
}
