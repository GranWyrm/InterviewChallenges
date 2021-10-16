package com.challenges.interview;

import java.util.Arrays;

public class MissingIntegerInArray {
    public static void main(String[] args) {
        int[] input1 = {1,3,6,4,1,2};
        int[] input2 = {1,2,3};
        int[] input3 = {-1,-2};

        if (findMissingInteger(input1) == 5)
            System.out.println("Passed test 1");
        if (findMissingInteger(input2) == 4)
            System.out.println("Passed test 2");
        if (findMissingInteger(input3) == 1)
            System.out.println("Passed test 3;");
    }

    private static int findMissingInteger(int[] input) {
        int val = 1;

        if (input.length == 0)
            return val;
        Arrays.sort(input);
        if (input[0] > 1)
            return val;
        if (input[input.length - 1] <= 0)
            return val;
        for (int j : input) {
            if (j == val)
                val++;
        }
        return val;
    }
}