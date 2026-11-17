package Lv1.problem10;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int gcd = gcd(n, m);
        int lcm = lcm(n,m);

        return new int[] { gcd, lcm };
    }
    public int gcd(int n , int m) {
        while (m != 0) {
            int tmp = m;
            m = n % m;
            n = tmp;
        }
        return n;
    }

    public int lcm(int n, int m) {
        int k = gcd(n,m);
        return n*m/k;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 3;
        int m = 12;
        System.out.println(Arrays.toString(sol.solution(n, m)));

    }
}