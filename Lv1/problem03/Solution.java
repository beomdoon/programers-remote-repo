package Lv1.problem03;

import java.lang.StringBuilder;

class Solution {
    public String solution(String phone_number) {
        StringBuilder str = new StringBuilder(phone_number);
         for(int i=0; i<str.length()-4; i++) { str.setCharAt(i, '*'); }
        return str.substring(0);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String phone_number = "01033334444";
        System.out.println(sol.solution(phone_number).toString());
    }
}
