package com.example.helloworld;

public class Arrays {
    public static void main(String[] args) {

        String[] cars = {"BMW", "Volvo", "Ford", "Mazda"};
        cars[3]="Opel";//change an array element
        System.out.println(cars[0]);//access the element of an array
        System.out.println(cars[3]);
        System.out.println(cars.length); // how many elements an arry has

        //for loop example outputs all elements in the cars array
        System.out.println("Below example outputs all elements in the cars array:");
        for (int i = 0; i < cars.length; i++){
            System.out.println(i);
        }
        /* for-each loop is easier to write than for loop
        for (String i : cars) {
            System.out.println(i);
        } */
    }
}
