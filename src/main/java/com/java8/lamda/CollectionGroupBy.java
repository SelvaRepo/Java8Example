package com.java8.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionGroupBy {
    public static void main(String[] args) {

        List<String> items = Arrays.asList("banana","banana","banana","apple", "orange", "banana", "papaya");

        Map<String, Long> result =
        items.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),Collectors.counting()
                )
        );
        System.out.println(result);
    }
}
