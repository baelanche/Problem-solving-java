package boj.math.prob;

import java.util.Scanner;

public class p2903 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        long dot = 1 + (long)Math.pow(2, n);
        System.out.println(dot * dot);
    }
}
