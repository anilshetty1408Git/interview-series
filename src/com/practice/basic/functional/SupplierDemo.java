package com.practice.basic.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "HI Krisha";
        System.out.println(supplier.get());

        Supplier<Integer> integerSupplier = () -> 420;
        System.out.println(integerSupplier.get());

        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(() -> "Nothing found"));
    }
}
