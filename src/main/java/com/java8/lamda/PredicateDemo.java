package com.java8.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        /*Predicate<Integer> pre = (t) -> {
            if (t%2 ==0){
                return true;
            }else{
                return false;
            }
        };*/
        Predicate<Integer> pre = t -> t%2 ==0;
        System.out.println("===>"+pre.test(12));

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().filter(pre).forEach( t -> System.out.println("Printing :"+t));

        list.stream().filter(t ->t%2 ==0).forEach( t -> System.out.println("Even NO :"+t));
    }
}
