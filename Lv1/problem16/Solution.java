package Lv1.problem16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[s.length()];

        for(int i=0; i<s.length(); i++) {
            answer[i] =i - map.getOrDefault(s.charAt(i), i+1);
            map.put(s.charAt(i), i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "banana";
        System.out.println(Arrays.toString(sol.solution(s)));
    }
}
