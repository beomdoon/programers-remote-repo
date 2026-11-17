package Lv1.problem17;

public class Solution {
    public String solution(String s, int n) {
        char[] arrays = s.toCharArray();
        for(int i=0; i<arrays.length; i++) {
            // 공백 무시
            if(arrays[i] == ' ') {  continue; }
            //n칸 밀기
            arrays[i]  += (char)n;

            if(arrays[i]-n <='z' && arrays[i] > 'z') { arrays[i] = (char) (arrays[i] - 'z' + 'a' -1); }
            else if(arrays[i]-n <='Z' && arrays[i] > 'Z') { arrays[i] = (char) (arrays[i] - 'Z' + 'A' -1); }
        }

        return String.valueOf(arrays);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("t", 7));
    }
}
