package Lv0.problem03;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] numbers, String direction) {
        if(direction.equals("left")) {
            int[] numArray = new int[numbers.length];
            for(int i=0; i<numbers.length-1; i++) {
                numArray[i] = numbers[i + 1];
            }
            numArray[numbers.length-1] = numbers[0];
            return numArray;
        } else if(direction.equals("right")) {
            int[] numArray = new int[numbers.length];
            numArray[0] = numbers[numbers.length-1];
            for(int i=1; i<numbers.length; i++) {
                numArray[i] = numbers[i-1];
            }
            return numArray;
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {1, 2, 3};
        String direction = "right";
        System.out.println(Arrays.toString(sol.solution(numbers, direction)));
    }
}
