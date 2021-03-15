package com.weekone.assignment5;

import java.util.Arrays;

interface Sort{
    String [] sort(String [] array);
}

public class LambdaSort {

    public static void main(String[] args) {
        LambdaSort l = new LambdaSort();
        String [] months = {"January","February","March","April","May","June","July","August","September","October","December"};


        String [] array =  l.sortbByLength.sort(months);
        System.out.println(Arrays.toString(array));

        array =  l.sortByLengthRevarse.sort(months);
        System.out.println(Arrays.toString(array));

        array =  l.sortByFirstChar.sort(months);
        System.out.println(Arrays.toString(array));

        array =  l.sortByEfirst.sort(months);
        System.out.println(Arrays.toString(array));

        System.out.println();

        months = new String[] {"January","February","March","April","May","June","July","August","September","October","December"};
        l.sortbByLength(months);

        System.out.println(Arrays.toString(months));
        l.sortByLengthRevarse(months);

        System.out.println(Arrays.toString(months));
        l.sortByFirstChar(months);
    }

    Sort sortbByLength = (array) -> {
        for (int i=1 ;i<array.length; i++) {
            String temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp.length() < array[j].length()) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        return array;
    };

    Sort sortByLengthRevarse = (array) -> {
        for (int i=1 ;i<array.length; i++) {
            String temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp.length() > array[j].length()) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        return array;
    };

    Sort sortByFirstChar = (array) -> {
        for (int i=1 ;i<array.length; i++) {
            String temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp.charAt(0) < array[j].charAt(0)) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        return array;
    };

    Sort sortByEfirst = (array) -> {
        for (int i=1 ;i<array.length; i++) {
            String temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp.indexOf('e') != -1)
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        return array;
    };


    public String[] sortbByLength(String [] array){
        Arrays.sort(array, (a, b) -> a.length() - b.length());
        return array;
    }

    public String[] sortByLengthRevarse(String [] array){
        Arrays.sort(array, (a, b) -> b.length() - a.length());
        return array;
    }

    public String[] sortByFirstChar(String [] array){
        Arrays.sort(array, (a, b) -> a.charAt(0) - b.charAt(0));
        return array;
    }

}
