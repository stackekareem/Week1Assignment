package com.weekone.assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of Strings, write a method that returns a list ofall strings that start with the letter 'a' (lower case) and have exactly 3 letters.
 */
public class Three {

    public static void main(String[] args) {
        Three t = new Three();
        List<String> words = new ArrayList<>();
        t.populate(words);
        System.out.println(words);
        List<String> filtedwords = t.getword(words);
        System.out.println(filtedwords);

    }

    public void populate(List<String> words){
        words.add("bbas");
        words.add("bweqe");
        words.add("adad");
        words.add("ada");
        words.add("adawa");
        words.add("baa");
        words.add("aaa");
    }

    /**
     * filters array
     * @param words
     * @return
     */
    public List<String> getword(List<String> words){
        return words.stream().filter((word) -> word.charAt(0) == 'a' && word.length() == 3)
                .collect(Collectors.toList());
    }
}
