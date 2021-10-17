package com.challenges.interview;

import java.util.Arrays;

/*
* Write a function that, given an array A of length N, an integer F and an integer M, returns an array
* containing possible results of the missed rolls.
* The returned array should contain F integers from 1 to 6 (valid dice rolls).
* If such an array does not exist then the function should return [0].
*
* N and F are integers within the range [1... 100,000]
* Each element of A should be within 1 to 6 range
* M should be within 1 and 5 range
*
* */
public class FindMissedRollsInDice {
    public static void main(String[] args) {
        Arrays.stream(solution(new int[]{3, 2, 4, 3}, 2, 4)).forEach(System.out::println);
        Arrays.stream(solution(new int[]{1,2,3,4},4,6)).forEach(System.out::println);

    }

    private static int[] solution(int[] A, int F, int M) {
        int sum = Arrays.stream(A).sum();
        int missingNumSum = M *(F + A.length) - sum;
        double eachRollActual = missingNumSum / (double) F;
        if (eachRollActual < 0 || eachRollActual > 6) {
            return new int[] {0};
        }
        int eachRoll = missingNumSum / F;
        int rem = missingNumSum % F;

        int[] answer = new int[F];

        for (int i = 0; i < F; i++) {
            answer[i] = eachRoll + (rem <= 0 ? 0 : 1);
            rem--;
        }
        return answer;

    }
}
