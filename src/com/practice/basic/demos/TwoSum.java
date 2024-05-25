package com.practice.basic.demos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,-2,11,5,2};
        int target = 9;
        int[] res = new int[2];
        Map<Integer,Integer> mapRes = new HashMap<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                res[0]=map.get(diff);
                res[1]=i;
                mapRes.put(map.get(diff),i);
                System.out.println(map.get(diff) + " " + i);
            } else {
                map.put(arr[i], i);
            }
        }
        System.out.println("----------");
        System.out.println(Arrays.toString(res));
    }
}
