package Lv1.problem06;

import java.util.Arrays;

public class Solution {
    public String solution(String s) {
        char[] str = s.toCharArray();
        Arrays.sort(str);
        String sortedStr = new String(str);
        StringBuilder reverseStr = new StringBuilder(sortedStr);

        reverseStr.reverse();
        return reverseStr.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "Zbcdefg";
        System.out.println(sol.solution(s));
    }
}