package com.practice.basic.java8;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public static void main(String[] args) {
        System.out.println("Non tax: " + evaluateTaxUsers("non tax"));
        System.out.println("tax: " + evaluateTaxUsers("tax"));
    }

    private static List<Employee> evaluateTaxUsers(String input) {

        return input.equalsIgnoreCase("tax") ? Database.getEmployeeList().stream()
                .filter(employee -> employee.getSalary() > 500000).collect(Collectors.toList()) :
                Database.getEmployeeList().stream().filter(n -> n.getSalary() <= 500000).collect(Collectors.toList());
    }


}
