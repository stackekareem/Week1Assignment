package com.weekone.assignment2;
import java.util.Scanner;

/**
 * adds user input
 */
public class Add {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //sum of number
        double sum = 0;
        //user input
        String input = "";

        System.out.println("type 'exit' to stop the program");

        //exit main loop if user enter exit
        while(!input.equals("exit")){
            try {
                input = scan.next();
                if (!input.equals("exit")){
                    //add to sum
                    sum += Double.parseDouble(input);
                    System.out.println("sum : " + sum);
                }
            } catch (Exception e) {
                System.err.println("value must be an integer");
                scan.next();
            }
        }
        scan.close();
    }
}