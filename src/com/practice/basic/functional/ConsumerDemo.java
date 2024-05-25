package com.practice.basic.functional;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {
    public static void main(String[] args) {
        /*Consumer<Integer> consumer = t -> System.out.println("Print " + t);
        consumer.accept(10);*/

        List<Integer> list = Arrays.asList(1, 5, 8, 9, 4);
        list.stream().forEach(t -> System.out.println("Print " + t));
    }

}
