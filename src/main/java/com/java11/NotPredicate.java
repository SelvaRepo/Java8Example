package com.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicate {
    public static void main(String[] args) {

        List<String> listString = Arrays.asList("Selva","\n\n\n", "  Jayanthi","\t\t","Siddu");



        List<String> withoutBlank = listString.stream()
                .filter(Predicate.not(String::isBlank))
                .filter(Predicate.isEqual("Selva"))
                .collect(Collectors.toList());
        System.out.println(withoutBlank);

    }
}
