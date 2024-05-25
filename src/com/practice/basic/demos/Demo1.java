package com.practice.basic.demos;

abstract class Demo1 {
    abstract void m1();

    void m2(){
        System.out.println("implement this");
    }
}
class Main extends Demo1{
    public static void main(String[] args) {
        Demo1 demo1 = new Main();
        demo1.m2();
    }

    @Override
    void m1() {
        System.out.println("Arse");
    }

    /*@Override
    void m2() {
        System.out.println("manin");
    }*/
}