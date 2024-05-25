package com.practice.basic.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachFilterDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Marali", "john", "peter", "mark", "mac");


        System.out.println("//        FILTER");
        list.stream().filter(m -> m.startsWith("m")).forEach(t -> System.out.println("list is :"+t));

        System.out.println("//        FOREACH");

        list.stream().forEach(t -> System.out.println(t));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Anil");
        map.put(2, "Akshatha");
        map.put(3, "Krisha");
        map.put(4, "James");
        map.put(5, "Zebra");
        map.forEach((integer, s) -> System.out.println("Key " + integer + " value " + s));
        System.out.println("-------------------------------- ");
        map.entrySet().stream().filter(a->a.getKey()%2==0).forEach(obj -> System.out.println(obj));

    }
}
