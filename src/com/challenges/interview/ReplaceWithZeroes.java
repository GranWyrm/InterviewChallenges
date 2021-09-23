package com.challenges.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ReplaceWithZeroes {

    public static void main(String[] args) {
        final int N = 4;
        int[][] array = new int[N][N];

        fillArrayWithRandom(array);

        printMatrix(array);

        replaceWithZeroes(array);



    }

    private static void printMatrix(int[][] array) {
        for (int[] i: array) {
            System.out.println(Arrays.toString(i));
        }
    }

    private static void replaceWithZeroes(int[][] array) {
        ArrayList<Integer> rowsToZero = new ArrayList<>();
        ArrayList<Integer> columnsToZero = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    if (!rowsToZero.contains(i)) {
                        rowsToZero.add(i);
                    }
                    if (!columnsToZero.contains(j)) {
                        columnsToZero.add(j);
                    }
                }
            }
        }

        for (Integer row : rowsToZero) {
            Arrays.fill(array[row], 0);
        }

        for (int i = 0; i < array.length; i++) {
            for (Integer col : columnsToZero) {
                array[i][col] = 0;
            }
        }

        System.out.println();
        printMatrix(array);
    }

    private static void fillArrayWithRandom(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(9);
            }
        }
    }
}
