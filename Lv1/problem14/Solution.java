package Lv1.problem14;

public class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        int wordIndex = 0;
        for(int i=0; i<charArray.length; i++) {
            if(charArray[i] == ' ') {
                wordIndex = 0;
                continue;
            }
            if(wordIndex%2 == 0) { charArray[i] = Character.toUpperCase(s.charAt(i)); }
            else { charArray[i] = Character.toLowerCase(s.charAt(i)); }
            wordIndex++;

        }
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "try hello world";
        System.out.println(sol.solution(s));
    }
}
