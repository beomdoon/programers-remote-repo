package Lv1.problem01;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] copyArray;
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {
            copyArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(copyArray);
            answer[i] = copyArray[commands[i][2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        int[] answer =sol.solution(array, commands);

        System.out.println(Arrays.toString(answer));
    }
}