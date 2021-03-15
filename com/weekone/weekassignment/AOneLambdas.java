package com.weekone.weekassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

interface Operation{
    boolean execute(int num);
}

public class AOneLambdas {

    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream(".\\com\\weekone\\weekassignment\\inputs\\AOneLamdas.txt");
            Scanner scan = new Scanner(file);
            AOneLambdas a = new AOneLambdas();
            int first = 0;
            while (scan.hasNextLine()){
                int count = 0;
                if (first == 0)
                    count = Integer.parseInt(scan.next());

                for (int i= 0 ; i < count; i++){
                    int operation = Integer.parseInt(scan.next());
                    int num = Integer.parseInt(scan.next());

                    String output = "";
                    if (operation == 1)
                        output= (a.isOdd.execute(num))? "ODD" : "EVEN";
                    else if (operation == 2)
                        output = (a.isPrime.execute(num))? "PRIME" : "COMPOSITE";
                    else if (operation == 3)
                        output = (a.isPalindrome.execute(num))? "PALINDROME" : "NOT PALINDROME";

                    System.out.println(output);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Operation isOdd = (num) -> num % 2 == 1;

    Operation isPrime = (num) -> {
        for (int i = 2 ; i < num / 2; i++)
            if (num % i == 0 ) return false;
        return true;
    };

    Operation isPalindrome = (num) -> {
        String original = String.valueOf(num);
        StringBuilder numstr = new StringBuilder(String.valueOf(num)).reverse();
        return original.equals(numstr.toString());
    };
}
