package utils;

import java.util.Arrays;

public class Assert {

    public static <T> void assertEquals(String testName, T expected, T actual) {
        if (expected == null) {
            if (processExpectedNull(actual)) {
                System.out.println(testName + " passed");
            } else {
                System.out.println(testName + " failed: expected " + null + ", actual " + actual);
            }
        } else {
            if (expected.equals(actual)) {
                System.out.println(testName + " passed");
            } else {
                System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
            }
        }
    }

    public static <T> boolean processExpectedNull(T actual) {
        return actual == null;
    }

    public static void assertEquals(String testName, Object[] expected, Object[] actual) {
        if (Arrays.equals(expected, actual)) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed: expected " + Arrays.toString(expected) + ", actual "
                    + Arrays.toString(actual));
        }
    }

}
