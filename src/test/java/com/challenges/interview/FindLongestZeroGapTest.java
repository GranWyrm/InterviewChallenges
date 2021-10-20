package com.challenges.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLongestZeroGapTest {
    private final FindLongestZeroGap findLongestZeroGap = new FindLongestZeroGap();

    @Test
    void solution() {
        assertEquals(5,findLongestZeroGap.solution(1041));
        assertEquals(0,findLongestZeroGap.solution(15));
        assertEquals(0, findLongestZeroGap.solution(0));
    }

    @Test
    void correctness() {
        assertEquals(0, findLongestZeroGap.solution(0));
    }
}