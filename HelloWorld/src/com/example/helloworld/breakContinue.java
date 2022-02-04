package com.example.helloworld;

public class breakContinue {

    public static void main(String[] args) {
        System.out.println("Below is an example of for loop using break");
        //This example stops the loop when i is equal to 4:
        for (int i = 0; i<10; i++){
            if (i ==5){
                break;
            }
            System.out.println(i);
        }

        System.out.println("Below is an example of for loop using continue");
        //This example skips the value 16:
        for (int a = 11; a<21; a++){
            if (a==16){
                continue;
            }
            System.out.println(a);
        }
    }
}
