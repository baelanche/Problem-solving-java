package boj.math.prob;

import java.util.Scanner;

public class p2420 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextInt();
        long m = sc.nextInt();
        
        System.out.println(Math.abs(n - m));
    }
}
