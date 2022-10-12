package com.example.demo.basicDocJava.knowledge.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/c5312072/Desktop/scripts/testout.txt");
            fileOutputStream.write(65);
            fileOutputStream.close();
            System.out.println("success......");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            FileOutputStream fileOut = new FileOutputStream("/Users/c5312072/Desktop/scripts/testout.txt");
            String s="Welcome to javaTpoint.";
            byte[] b =s.getBytes(); // converting string into byte array
            fileOut.write(b);
            fileOut.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
