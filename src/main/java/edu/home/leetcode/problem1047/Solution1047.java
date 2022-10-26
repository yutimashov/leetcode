package edu.home.leetcode.problem1047;

public class Solution1047 {

    public static String removeDuplicates(String s) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (answer.length() == 0 || s.charAt(i) != answer.charAt(answer.length() - 1)) {
                answer.append(s.charAt(i));
            } else {
                answer.deleteCharAt(answer.length() - 1);
            }
        }
        return answer.toString();
    }

}
