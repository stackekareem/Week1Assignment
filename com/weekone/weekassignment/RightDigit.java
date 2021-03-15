package com.weekone.weekassignment;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Given a list of non-negative integers, return an integer list of the rightmost digits.
 */
public class RightDigit {
    public static void main(String[] args) {
        try {
            RightDigit r = new RightDigit();
            FileInputStream file = new FileInputStream(".\\com\\weekone\\weekassignment\\inputs\\RightDigit.txt");
            Scanner scan = new Scanner(file);
            List<Integer> nums = new ArrayList<>();

            while (scan.hasNext())
                nums.add(scan.nextInt());

            System.out.println(r.filter(nums));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Integer> filter(List<Integer> nums){
        return nums.stream().map((num) -> num % 10).collect(Collectors.toList());
    }
}
