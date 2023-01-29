package boj.realize.prob;

import java.util.Scanner;

public class p14470 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int result = 0;
        if (a < 0) {
            result += Math.abs(a) * c;
        }
        if (a <= 0) {
            result += d;
        }
        if (a > 0) {
            result += (b - a) * e;
        } else {
            result += b * e;
        }
        System.out.println(result);
    }
}
