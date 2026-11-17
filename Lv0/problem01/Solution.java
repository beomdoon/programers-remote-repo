package Lv0.problem01;

import java.util.LinkedHashSet;
import java.util.Set;
import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string) {
        Set<Character> set = new LinkedHashSet<>();

        for (int i=0; i<my_string.length();i++) {
            set.add(my_string.charAt(i));
        }
        StringBuilder str = new StringBuilder();
        for(char alphabet : set) {
            str.append(alphabet);
        }
        return str.substring(0, str.length());
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String my_string = "people";
        System.out.println(sol.solution(my_string));
    }
}