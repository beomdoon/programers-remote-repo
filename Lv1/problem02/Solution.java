package Lv1.problem02;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) { return new int[] {-1}; }
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(num -> num != min).toArray();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = { 4,3,2,1 };
        int[] answer = sol.solution(arr);
        System.out.println(Arrays.toString(answer));
    }
}
