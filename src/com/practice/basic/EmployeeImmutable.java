package com.practice.basic;

import java.util.*;
import java.util.stream.Collectors;

public final class EmployeeImmutable {
    private final String name;
    private final Date doj;
    private final List<String> mobile;

    private final Address address;

    public EmployeeImmutable(String name, Date doj, List<String> mobile,Address address) {
        this.name = name;
        this.doj = doj;
        this.mobile = mobile;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public Date getDoj() {
        return (Date) this.doj.clone();
    }

    public List<String> getMobile() {
        return new ArrayList<>(mobile);
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getZip());
    }

    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "name='" + name + '\'' +
                ", doj=" + doj +
                ", mobile=" + mobile +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Address address1=new Address("bengaluru","101");
        EmployeeImmutable employeeImmutable = new EmployeeImmutable("Anil",date, Arrays.stream(new String[]{"123","456"}).collect(Collectors.toList()),address1);
        employeeImmutable.getDoj().setDate(15);
        employeeImmutable.getMobile().add("9010");
        employeeImmutable.getAddress().setCity("Tumkur");
        System.out.println(employeeImmutable);
    }
}

