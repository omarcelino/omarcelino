package com.example.filehandling;

import java.io.File;

public class deleteFile {
    public static void main(String[] args) {
        File myObj = new File("Filename.txt");

        if (myObj.delete()){
            System.out.println("File is deleted" + myObj.getName());
        }
        else {
            System.out.println("Failed to delete the file");
        }
    }
}
