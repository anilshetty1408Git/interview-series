package com.practice.basic.demos;

@FunctionalInterface
public interface FUnctionalInterfaceDemo {

    static void m2() {
        System.out.println("static call!");
    }

    void m1();

    default void execute() {
        System.out.println("execute!");
    }
}
class MainInterfaceDemo implements FUnctionalInterfaceDemo{
    public static void main(String[] args) {
        FUnctionalInterfaceDemo demo = new MainInterfaceDemo();
        demo.execute();
        demo.m1();
    }

    @Override
    public void m1() {
        System.out.println("hee");
    }

    /*@Override
    public void execute() {
        System.out.println("from child");
    }*/
}