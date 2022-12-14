package utils;

import edu.home.leetcode.problem1047.Solution1047Test;
import edu.home.leetcode.problem1662.Solution1662Test;

import java.util.Date;

public class TestSuite {

    public static void main(String[] args) {
        System.out.println(new Date() + ": tests started...");

        System.out.println("--------");
        Solution1047Test.main(args);
        System.out.println("--------");
        Solution1662Test.main(args);
        System.out.println("--------");

        System.out.println(new Date() + ": tests completed");
    }

}
