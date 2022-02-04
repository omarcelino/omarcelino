package com.example.helloworld;

public class IfStatement {
    public static void main(String[] args) {
        System.out.println("Hello World");

        if (20 > 19) {
            System.out.println("2o is greater than 19");
        }

        double time = 2.30;

        if (time < 10.00) {
            System.out.println("Good morning");
        } else if (time > 12.00) {
            System.out.println("Good day");
        } else {
            System.out.println("Good afternoon");
        }
    }
}