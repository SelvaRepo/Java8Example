package com.java8.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo{


    public static void main(String[] args) {
        /*Supplier<String> supplier = () -> {
            return "Hello Java Techie";
        };*/

        Supplier<String> supplier = () -> "Hello... Java Techie";
        //System.out.println(supplier.get());

        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(supplier));
    }
}

/*public class SupplierDemo implements Supplier<String> {
    @Override
    public String get() {
        return "Hey Java Techie";
    }

    public static void main(String[] args) {
        Supplier<String> supplier = new SupplierDemo();
        System.out.println(supplier.get());
    }
}*/
