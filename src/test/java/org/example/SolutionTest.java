package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxAreaTest() {
        Solution solution = new Solution();
        assertEquals(49, solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        assertEquals(1, solution.maxArea(new int[]{1,1}));
        assertEquals(56, solution.maxArea(new int[]{4,7,3,1,4,7,4,2,9,7}));
        assertEquals(6, solution.maxArea(new int[]{3,3,3}));
    }

}