package com.example.helloworld;

public class forLoop {

    public static void main(String[] args) {
        //Print even numbers
        for (int i = 0; i < 10; i=i + 2){
            System.out.println(i);
        }

        String[] cars = {"BMW", "Toyota", "Ford","Volvo"};

        for (String a : cars){
            System.out.println(a);
        }
    }
}
