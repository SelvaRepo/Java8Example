package com.java8.lamda;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("CCC", 33);
        map.put("AAA", 11);
        map.put("DDD", 444);
        map.put("BBB", 22);

        //map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        /*for (Map.Entry<String, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() +"---"+entry.getValue());
        }*/

        //List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        //Collections.sort(entries, ((o1, o2) -> o1.getKey().compareTo(o2.getKey())));
        //Collections.sort(entries, Comparator.comparing(Map.Entry::getValue));
        /*Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //return o1.getKey().compareTo(o2.getKey());
                return o1.getValue().compareTo(o2.getValue());
            }
        });*/
        /*for (Map.Entry<String, Integer> entry:entries){
            System.out.println(entry.getKey() +"---"+entry.getValue());
        }*/
    }
}
