package boj.math.prob;

import java.util.Scanner;

public class p2355 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextInt();
        long b = sc.nextInt();
        
        long sum = (a + b) * (Math.abs(b-a)+1) / 2;
        System.out.println(sum);
    }
}
