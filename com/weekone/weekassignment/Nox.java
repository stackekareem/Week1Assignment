package com.weekone.weekassignment;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string has all its "x" removed
 */
public class Nox {

    public static void main(String[] args) {
        try {
            Nox r = new Nox();
            FileInputStream file = new FileInputStream(".\\com\\weekone\\weekassignment\\inputs\\noX.txt");
            Scanner scan = new Scanner(file);
            List<String> words = new ArrayList<>();
            while (scan.hasNext())
                words.add(scan.next());

            System.out.println(r.nox(words));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> nox(List<String> words){
        return words.stream().map((word) -> word.replace("x","")).collect(Collectors.toList());
    }

}
