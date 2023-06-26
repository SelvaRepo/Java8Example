package com.java11;

public class OpenJdk11Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the main class");
        System.out.println("Test 1");
        new OpenJdk11Main().run(args);
    }

    public void run(String[] args) {
        System.out.println("Hello world from " + getClass().getClassLoader().getName());
    }
}
