package boj.greedy.prob;

import java.util.Scanner;

public class p1343 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] c = sc.next().toCharArray();
        String s = "";


        for (int i=0; i<c.length;) {
            int stack = 0;
            boolean b = false;
            for (int j=i; j<c.length; j++) {
                if (c[j] == 'X') {
                    stack++;
                } else {
                    b = true;
                    break;
                }
            }
            if (stack % 2 == 1) {
                System.out.println(-1);
                return;
            } else {
                i += stack;
                while (4 <= stack) {
                    s += "AAAA";
                    stack -= 4;
                }
                while (2 <= stack) {
                    s += "BB";
                    stack -= 2;
                }
                if (b) {
                    s += ".";
                    i++;
                }
            }
            stack = 0;
        }
        System.out.println(s);
    }
}
