package boj.realize.prob;

import java.util.Scanner;

public class p9295 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int i=1; i<=t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case " + i + ": " + (a+b));
        }
    }
}
