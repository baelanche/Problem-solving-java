package boj.realize.prob;

import java.util.Scanner;

public class p2845 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        int p = sc.nextInt();
        
        int a = sc.nextInt() - l*p;
        int b = sc.nextInt() - l*p;
        int c = sc.nextInt() - l*p;
        int d = sc.nextInt() - l*p;
        int e = sc.nextInt() - l*p;
        
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
    }
}
