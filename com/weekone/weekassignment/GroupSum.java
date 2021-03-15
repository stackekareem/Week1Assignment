package com.weekone.weekassignment;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target
 */
public class GroupSum {

    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(".\\com\\weekone\\weekassignment\\inputs\\groupsum.txt");
            Scanner scan = new Scanner(file);
            String [] input = scan.nextLine().split(" ");
            GroupSum a = new GroupSum();
            int[] group = new int[input.length - 1];
            for (int i = 0; i < input.length - 1; i++) {
                group[i] = Integer.parseInt(input[i]);
            }
            int target = Integer.parseInt(input[input.length - 1]);
            System.out.print(Arrays.toString(group));
            System.out.println(target);
            System.out.println(a.groupSum(group,target));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * add equal adjacent numbers
     * @param nums
     * @param target
     * @return
     */
    public boolean groupSum(int[] nums,int target){
        List<Integer> numslist = new ArrayList<>();
        int prev = Integer.MIN_VALUE;
        int index  = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != prev) numslist.add(nums[i]);
            else {
                int n = numslist.size() - 1;
                int v = numslist.get(n) + nums[i];
                numslist.set(n, v);
            }
            prev = nums[i] ;

        }
        int [] shrikednums = new int[numslist.size()];
        for (int i = 0 ; i < shrikednums.length; i++)
            shrikednums[i] = numslist.get(i);

        System.out.println(Arrays.toString(shrikednums));
        return  groupSumClump(0, shrikednums,target);
    }

    public boolean groupSumClump(int start, int[] nums, int target) {
       return true;
    }
}
