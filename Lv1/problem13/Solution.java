package Lv1.problem13;

public class Solution   {
    public int solution(int[] number) {
        int count = 0;
        for(int i=0; i<number.length;i++) {
            int num1 = number[i];
            for(int j=i+1; j<number.length; j++) {
                int num2 = number[j];
                for(int k=j+1; k<number.length; k++) {
                    int num3 = number[k];
                    if(num1 + num2 + num3 == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] number = {-3, -2, -1, 0, 1, 2, 3};
        int answer = solution.solution(number);
        System.out.println(answer);
    }
}
