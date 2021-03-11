package com.weekone.assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * gets the amount of time a character appears in a file
 */
public class FindCharInFile {
    public static void main(String[] args) {
        try {

        if (args.length == 0 || args[0].length() == 0)
            System.err.println("pass a character as argument");
        else {
            //frequency
            int frequency = 0;
            char c = args[0].charAt(0);

            //gets file to read
            File file = new File("./test.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            
            Scanner scan = new Scanner(file);

            //iterate through file line by line
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                for( int i = 0 ; i < data.length();i++)
                    frequency += (data.charAt(i) == c) ? 1 : 0;
            }
            System.out.println("frequency of "+c+": "+frequency);
            scan.close();
        }
        } catch (FileNotFoundException e) {
            System.err.println("file not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
