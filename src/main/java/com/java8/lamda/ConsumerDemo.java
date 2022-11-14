package com.java8.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerDemo {
    public static void main(String[] args) {
        //Consumer<Integer> con = t -> System.out.println("Printing :"+t);
        //con.accept(100);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().forEach(t -> System.out.println("Printing :"+t));

        //Consumer<String> printConsumer = t -> System.out.println(t);
        //Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
        //cities.forEach(printConsumer);
    }
}
