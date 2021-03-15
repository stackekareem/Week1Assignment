package com.weekone.weekassignment;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list where each integer is multiplied by 2.
 */
public class Doubling {

    public static void main(String[] args) {
        try {
            Doubling r = new Doubling();
            FileInputStream file = new FileInputStream(".\\com\\weekone\\weekassignment\\inputs\\doubling.txt");
            Scanner scan = new Scanner(file);
            List<Integer> nums = new ArrayList<>();
            while (scan.hasNext())
                nums.add(scan.nextInt());

            System.out.println(r.doubling(nums));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Integer> doubling(List<Integer> nums){
        return nums.stream().map((num) -> num * 2).collect(Collectors.toList());
    }
}
