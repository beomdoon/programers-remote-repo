package Lv1.problem19;

public class Solution {
    public String solution(int[] food) {
        StringBuilder strb = new StringBuilder();

        for(int i=1; i< food.length; i++) {
            for(int j=0; j<food[i]/2; j++) {
                strb.append(i);
            }
        }
        String foodArrays = strb.reverse().toString();
        return strb.reverse().append(0).append(foodArrays).toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] food = {1, 3, 4, 6};
        System.out.println(sol.solution(food));
    }
}
