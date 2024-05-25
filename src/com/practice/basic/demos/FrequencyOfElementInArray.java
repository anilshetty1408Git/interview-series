package com.practice.basic.demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyOfElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 9, 7, 7, 1, 4, 4, 7, 7};

        IntStream.of(arr).boxed().toList().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).forEach(System.out::println);
        System.out.println("-----------------");

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> collect = new ArrayList<>(map.entrySet());
        System.out.println(collect);
    }
}
