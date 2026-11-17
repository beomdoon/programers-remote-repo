package Lv1.problem11;

public class Solution {
    public int solution(String t, String p) {
        int count = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            String part = t.substring(i, i + p.length());
            if(Long.parseLong(part) <= Long.parseLong(p) ) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String t = "500220839878";
        String p = "7";
        System.out.println("답: " + sol.solution(t, p));
    }
}
