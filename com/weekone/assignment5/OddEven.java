package com.weekone.assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * add 'e' prefix to even number an 'o' prefix to ood number
 */
public class OddEven {
    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
        List <String> numbers = new ArrayList<>();
        oddEven.populate(numbers,10);
        List <String> OEnumbers = oddEven.addPrefix(numbers);
        System.out.println(OEnumbers);
    }

    /**
     * populates array
     * @param numbers
     * @param size
     */
    public void populate(List<String> numbers,int size){
        int randNum;
        for (int i = 0; i < size ;i++) {
            randNum = (int) (Math.random() * 100 + 1);
            numbers.add(String.valueOf(randNum));
        }
    }

    /**
     * add prefix
     * @param numbers
     * @return
     */
    public List<String> addPrefix(List<String> numbers){
       return numbers.stream().map((num) -> {
            int intnum = Integer.valueOf(num);
            return (intnum % 2 == 0) ? "e"+num : "o"+num;
        } ).collect(Collectors.toList());
    }
}
