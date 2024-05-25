package com.practice.basic.java8;

import java.util.Arrays;
import java.util.List;

public class Database {

    public static List<Employee> getEmployeeList() {
        return Arrays.asList(
                new Employee(176, "Roshan", "IT", 600000),
                new Employee(388, "Bikash", "CIVIL", 900000),
                new Employee(470, "Bimal", "DEFENCE", 500000),
                new Employee(624, "Sourav", "CORE", 400000),
                new Employee(176, "Prakash", "SOCIAL", 1200000)
        );
    }
}
