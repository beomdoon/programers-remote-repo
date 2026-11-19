package Lv1.problem18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j< numbers.length; j++) {
                int result = numbers[i] + numbers[j];
                if(!list.contains(result)) {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }
        int[] arrays = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arrays);
        return arrays;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] numbers = { 2, 1, 3, 4, 1 };
        System.out.println(Arrays.toString(sol.solution(numbers)));

    }
}
