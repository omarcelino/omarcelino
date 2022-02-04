package com.company;
import java.util.Scanner; // import the Scanner class

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        String userName;
        int age;
        double salary;
        try (Scanner myObj = new Scanner(in)) {

            // Enter username and press Enter
            out.println("Enter username, Age, Salary ");
            userName = myObj.nextLine();
            age = myObj.nextInt();
            salary = myObj.nextDouble();
        }

        out.println("Username is: " + userName +"\n" + "Age is: " + age + "\n" +"Salary: " + salary);
    }
}
