package Lv1.problem07;

public class Solution {
    public boolean solution(String s) {
        if(4 > s.length() || 6 < s.length()){ return false; }

        char[] charArray = s.toCharArray();
        for(char character : charArray) {
            if('0' > character || character >'9') { return false; }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "a234";
        System.out.println(sol.solution(s));
    }
}