package com.practice.basic.lambda;

public class CalculatorImpl {
    public static void main(String[] args) {
        /*Calculator calculator = () -> System.out.println("Lambda expression");
        calculator.switchOn();*/

       /* Calculator calculatorSum = (a) -> System.out.println(++a);
        calculatorSum.sum(10);*/

//        Calculator calculator = (a,b) -> System.out.println(a+b);
        Calculator calculator = (a, b) ->
            a+b;

        int sum = calculator.sum(35, 8);
        System.out.println(sum);


    }
}
