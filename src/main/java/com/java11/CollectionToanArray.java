package com.java11;

import java.util.Arrays;
import java.util.List;

public class CollectionToanArray {
    public static void main(String[] args) {

        List<String> listString = Arrays.asList("Selva","Javayanthi","Siddu");
        String[] stringArray = listString.toArray(String[]::new);
        for (String s : stringArray) {
            System.out.println(s);
        }

    }
}
