package edu.home.leetcode.problem1047;

import static edu.home.leetcode.problem1047.Solution1047.removeDuplicates;
import static utils.Assert.assertEquals;

public class Solution1047Test {

    public static void main(String[] args) {
        testAbbac();
        testSingleCharString();
        testAa();
    }

    public static void testAbbac() {
        assertEquals("Solution1047Test.testAbbac", "c", removeDuplicates("abbac"));
    }

    public static void testSingleCharString() {
        assertEquals("Solution1047Test.testA", "a", removeDuplicates("a"));
    }

    public static void testAa() {
        assertEquals("Solution1047Test.testAa", "", removeDuplicates("aa"));
    }

}