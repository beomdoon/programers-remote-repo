package Lv1.problem15;

import java.lang.StringBuilder;

public class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        while(n>=3) {
            sb.append(String.valueOf(n%3));
            n /= 3;
        }
        sb.append(String.valueOf(n));

        String num = sb.toString();
        return Integer.parseInt(num, 3);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(45));
    }
}
