package com.java8.lamda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Selva");
        list.add("Chenna");
        list.add("Elaya");

        //Prints all
       // list.stream().forEach( t -> System.out.println(t));
        list.stream().filter(t -> t.startsWith("S")).forEach( t -> System.out.println(t));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Selva");
        map.put(2, "Chenna");
        map.put(3, "Elaya");

        //map.forEach( (key,value) -> System.out.println(key +" : "+value));
       // map.entrySet().stream().forEach(obj -> System.out.println(obj));
        map.entrySet().stream().filter(t -> t.getKey()%2==0).forEach(obj -> System.out.println(obj));
    }
}
