package Lv1.problem09;

import java.util.Scanner;
import java.lang.StringBuilder;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder str = new StringBuilder();
        for(int i=0; i<a; i++) { str.append('*'); }
        String s = str.toString();
        for(int i=0; i<b; i++) { System.out.println(s); }
    }
}
