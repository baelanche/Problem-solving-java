package boj.realize.prob;

import java.util.Scanner;

public class p2506 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int score = 0;
        int con = 0;
        for (int i=0; i<n; i++) {
            int q = sc.nextInt();
            if (q == 1) {
                score += q + con;
                con++;
            } else {
                con = 0;
            }
        }
        System.out.println(score);
    }
}
