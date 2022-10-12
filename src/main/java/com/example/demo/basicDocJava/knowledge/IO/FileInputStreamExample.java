package com.example.demo.basicDocJava.knowledge.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) throws FileNotFoundException {
//        try {
//            FileInputStream fileInputStream = new FileInputStream("/Users/c5312072/Desktop/scripts/testout.txt");
//            int i = fileInputStream.read();
//            System.out.println((char) i); // w
//            fileInputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/c5312072/Desktop/scripts/testout.txt");
            int i = 0;
            while ( (i = fileInputStream.read()) != -1) {
                System.out.println((char) i);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
