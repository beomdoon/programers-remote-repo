package Lv1.problem05;

public class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
            int count = 0;
              for(int j=1; j<=Math.sqrt(i); j++) {
                if(i%j == 0) {
                    if(j==Math.sqrt(i)) {count++;}
                    else {count+=2;}
                }
            }
            answer = (count%2==0) ? (answer+i) : (answer-i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(13, 17));
    }
}
