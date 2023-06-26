package com.java11;

import java.util.List;
import java.util.stream.Collectors;

public class StringMethods {
    public static void main(String[] args) {
        String multilineString = "Baeldung \n helps developers \n explore Java.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());

        System.out.println(lines);
    }
}
