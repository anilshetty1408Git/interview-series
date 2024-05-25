package com.practice.basic.exception;

public class TryCatchFinallyReturnFlow {
    public static void main(String[] args) {
        String s3 = new String("anil");
        String s4 = new String("anil");
        String s1 ="anil";
        String s2="anil";
        System.out.println(s3==s4);
        System.out.println(s1==s4);

    }

    private static int m1() {
        try {
//            System.out.println(10/0);
            System.exit(0);
            return 1;
        } catch (Exception e){
            return 2;
        } finally {
            return 3;
        }

    }
}
