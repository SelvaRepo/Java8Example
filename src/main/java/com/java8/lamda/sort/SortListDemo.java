package com.java8.lamda.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(2);
        list.add(5);
        list.add(7);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        list.stream().sorted().forEach(value -> System.out.println(value));
        list.stream().sorted(Collections.reverseOrder()).forEach(value -> System.out.println(value));
    }
}
