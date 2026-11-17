package Lv0.problem02;

import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder str = new StringBuilder(my_string);
        return str.substring(str.length()-n, str.length());
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "ProgrammerS123";
        String string2 = "W0r1d";
        System.out.println(sol.solution(my_string, 11));
        System.out.println(sol.solution(string2, 5));
    }
}