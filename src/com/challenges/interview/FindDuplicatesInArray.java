package com.challenges.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* Find all duplicates in an array algorithm, output only duplicate values
 [1,1,3,4,7,7,9,9,17,19,19,20] */
public class FindDuplicatesInArray {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        final int SIZE = 10;
        final int UPPER_LIMIT = 9;
        fillArrayRandom(numbers, SIZE, UPPER_LIMIT);

        System.out.println(numbers);

        Set<Integer> store = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        //This method requires 2 sets because when you find more than 2 duplicates you don't want to store the value again
        for (Integer n : numbers) {
            if (!store.add(n)) {
                duplicates.add(n);
            }
        }

        duplicates.forEach(System.out::println);
        // Another solution for when you need the number of times the element is repeated

        Map<Integer,Integer> duplicateAndCount = new HashMap<>();

        for (Integer n : numbers) {
            if (duplicateAndCount.containsKey(n)) {
                duplicateAndCount.put(n, duplicateAndCount.get(n) + 1);
            } else {
                duplicateAndCount.put(n,1);
            }
        }

        System.out.println();

        duplicateAndCount.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key);
            }
        });
    }

    private static void fillArrayRandom(ArrayList<Integer> numbers, int size, int upperLimit) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(upperLimit));
        }
    }
}
