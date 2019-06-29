package boj.realize.prob;

import java.util.Scanner;

public class p10818 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        int n = sc.nextInt();
        while(n-->0) {
            int a = sc.nextInt();
            max = Math.max(max, a);
            min = Math.min(min, a);
        }
        System.out.println(min + " " + max);
    }
}
