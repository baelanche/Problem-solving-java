package boj.realize.prob;

import java.util.Scanner;

public class p10156 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.println((k * n - m) < 0 ? 0 : k * n - m);
    }
}
