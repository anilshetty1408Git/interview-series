package com.practice.basic.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (t) -> {
            if (t % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };

        Predicate<Integer> integerPredicate = t -> t % 2 == 0;
        System.out.println(predicate.test(5));
        System.out.println("-----------------");
        System.out.println(integerPredicate.test(30));

        System.out.println("-----------------------");

        List<Integer> list = Arrays.asList(1, 5, 8, 9, 4);
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Print even no " + t));


    }
}
