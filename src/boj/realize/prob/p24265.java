package boj.realize.prob;

import java.util.Scanner;

public class p24265 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        System.out.println((n-1) * ((n-1)*(n-2))/2);
        System.out.println(2);
    }
}
