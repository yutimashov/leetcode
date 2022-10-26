package edu.home.leetcode.problem1662;

import static edu.home.leetcode.problem1662.Solution1662.arrayStringsAreEqual;
import static utils.Assert.assertEquals;

public class Solution1662Test {

    public static void main(String[] args) {
        testEquivalentArrays();
        testNonEquivalentArrays();
    }

    public static void testEquivalentArrays() {
        assertEquals("Solution1662Test.testEquivalentArrays", true,
                arrayStringsAreEqual(new String[] {"ab", "c"}, new String[] {"a", "bc"}));
    }

    public static void testNonEquivalentArrays() {
        assertEquals("Solution1662Test.testEquivalentArrays", false,
                arrayStringsAreEqual(new String[] {"a", "b"}, new String[] {"aa", "bb"}));
    }

}