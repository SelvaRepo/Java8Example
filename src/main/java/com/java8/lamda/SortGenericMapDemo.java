package com.java8.lamda;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortGenericMapDemo {
    public static void main(String[] args) {
        Map<Employee, Integer> map = new TreeMap<>(Comparator.comparing(Employee::getName));
        Employee selva = new Employee();
        selva.setId(11);
        selva.setName("Selva");
        map.put(selva, 200);

        Employee elaya = new Employee();
        elaya.setId(21);
        elaya.setName("Elaya");
        map.put(elaya, 300);

        Employee bai = new Employee();
        bai.setId(22);
        bai.setName("Bai");
        map.put(bai, 100);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed()))
                .forEach(System.out::println);

    }
}
