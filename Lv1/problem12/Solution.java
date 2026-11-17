package Lv1.problem12;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int count = 0;
        Arrays.sort(d);
        for(int money : d) {
            if(budget >= money) {
                budget -= money;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] d = { 1, 3, 2, 5, 4 };
        int budget = 9;

        System.out.println(sol.solution(d, budget));
    }
}
