package com.example.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("Filename.txt");
            myWriter.write("Java is fun, really!!!!!");
            myWriter.close();
            System.out.println("Successfully written on the java file");
        } catch (IOException e){
            System.out.println("Error Occurred");
            e.printStackTrace();
        }
    }
}
