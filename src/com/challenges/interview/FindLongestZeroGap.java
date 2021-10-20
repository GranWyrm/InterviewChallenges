package com.challenges.interview;

import java.util.stream.IntStream;
// BinaryGap Codility solution
public class FindLongestZeroGap {
    public static void main(String[] args) {
        solution(1041);
        solution(328);
        solution(42);
        solution(1376796946);
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        int answer;
        String binary = Integer.toBinaryString(N);
        if(!binary.contains("0")) return 0;
        String[] gaps = binary.split("1");

        int endVal = gaps.length;
        if (binary.endsWith("0")) endVal -= 1;
        answer = IntStream.range(0, endVal).map(i -> gaps[i].length()).max().orElse(0);
        return answer;
    }
}
