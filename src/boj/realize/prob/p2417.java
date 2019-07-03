package boj.realize.prob;

import java.util.Scanner;

public class p2417 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        
        System.out.println((long)(Math.ceil(Math.sqrt(n))));
    }
}
