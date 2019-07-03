package boj.realize.prob;

import java.util.Scanner;

public class p5988 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while(n-->0) {
            String k = sc.next();
            if(k.charAt(k.length()-1) % 2 == 0) System.out.println("even");
            else System.out.println("odd");
        }
    }
}
