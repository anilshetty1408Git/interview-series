package com.practice.basic.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBasedOnLastDigit {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(43, 31, 72, 29));

        Comparator<Integer> comparator = (o1, o2) -> {
            /*if (o1 % 10 > o2 % 10)
                return 1;
            else return -1;*/
            return o1%10>o2%10?1:-1;
        };
//        Collections.sort(list,comparator);
        list.sort(comparator);
        System.out.println(list);

//     sort based on length of string
        List<String> stringList = new ArrayList<>(List.of("Anil", "Akshatha", "Krisha"));
        Comparator<String> stringComparator = (o1, o2) -> {
            /*if (o1.length() > o2.length()) {
                return 1;
            } else return -1;*/
            return o1.length()>o2.length()?1:-1;
        };
//        Collections.sort(stringList, stringComparator);
        stringList.sort(stringComparator);
        System.out.println(stringList);

    }
}
