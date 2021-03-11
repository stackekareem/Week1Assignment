package com.weekone.assignment3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * append to file
 */
public class AppendToText {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        try {
        System.out.println("enter path to file");
        //get path to file
        String path = scan.next();
        File f1 = new File(path);
        //if file doesnt exist create it
        if(!f1.exists()) {
            f1.createNewFile();
        }

        FileWriter fileWritter = new FileWriter(f1.getName(),true);
        BufferedWriter bw = new BufferedWriter(fileWritter);
        System.out.println("append to file");

        //write get and write user input to file
        String userinput  = scan.next();
        bw.write(userinput);

        bw.close();
        scan.close();
        } catch (IOException e) {
            e.printStackTrace();
            scan.next();
        }
    }
}
