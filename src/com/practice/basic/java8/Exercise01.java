package com.practice.basic.java8;

import java.util.Arrays;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> list = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        System.out.println("print odd");

        numbers.stream().filter(num->num%2==1).forEach(System.out::println);

        System.out.println("Print all Courses indivisually");
        list.stream().forEach(System.out::println);
        System.out.println("Print courses containing word Spring");
        list.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
        System.out.println(" Print course whose name has at least 4 letters");
        list.stream().filter(course->course.length()>=4).forEach(System.out::println);

        System.out.println("find sum of all even numbers");
        Integer evenSum = numbers.stream().filter(num -> num % 2 == 0).reduce(0, Integer::sum);
        System.out.println(evenSum);

        System.out.println("printNoOfCharacterInEachCourse");
        list.stream().map(str->str+"->"+str.length()).forEach(System.out::println);
    }
}
