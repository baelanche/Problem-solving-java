package boj.math.prob;

import java.util.Scanner;

public class p2965 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int max = b-a > c-b ? b-a : c-b;
        System.out.println(max-1);
    }
}
