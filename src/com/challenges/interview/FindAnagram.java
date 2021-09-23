package com.challenges.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

// Given two strings, write a function to determine if the second string is an anagram of the first.
// An anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema and iceman.
// Function must be space sensitive.
public class FindAnagram {
    public static void main(String[] args) {

        String original = "liSa";
        String toBeTested = "isla";

        if (isAnagram(original,toBeTested)) {
            System.out.println(toBeTested + " is an anagram of: " + original);
        } else {
            System.out.println(toBeTested + " is NOT an anagram of: " + original );
        }
    }

    // This function is case-insensitive
    private static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        List<Character> temp1 = new ArrayList<>();
        List<Character> temp2 = new ArrayList<>();

        for (Character c : s1.toLowerCase(Locale.ROOT).toCharArray()) {
            temp1.add(c);
        }

        for (Character c : s2.toLowerCase(Locale.ROOT).toCharArray()) {
            temp2.add(c);
        }

        Collections.sort(temp1);
        Collections.sort(temp2);

        return temp1.equals(temp2);

    }
}
