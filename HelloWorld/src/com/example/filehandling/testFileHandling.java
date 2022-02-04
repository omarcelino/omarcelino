package com.example.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class testFileHandling {
    public static void main(String[] args) {
        File myObj;
        FileWriter myWriter;
        String data;

        // create a file name
        try {
            myObj = new File("test.txt");
            if (myObj.createNewFile()){
                System.out.println("File is created: " + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e){
            System.out.println("An error occurred ");
            e.printStackTrace();
        }

        // Write to the file
        try {
            myWriter = new FileWriter("test.txt");
            myWriter.write("Hello Brian, this is ar file handling test");
            myWriter.write("Bien Trabajar");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        // read the file created
        try {
            myObj = new File("test.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()){
                data = myReader.nextLine();
                System.out.println(data);
            } myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        // Get file information
        myObj = new File("test.txt");
        if (myObj.exists()){
            System.out.println("Filename:" + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
        } else {
            System.out.println("File do not exists");
        }

        // Delete the file
        myObj = new File("test.txt");
        if (myObj.delete()){
            System.out.println("Deleted the file" + myObj.getName());
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
