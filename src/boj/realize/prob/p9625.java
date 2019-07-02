package boj.realize.prob;

import java.util.Scanner;

public class p9625 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int a = 1;
        int b = 0;
        
        while(k-->0) {
            int tempB = a;
            a -= a;
            a += b;
            b += tempB;
        }
        
        System.out.println(a + " " + b);
    }
}
