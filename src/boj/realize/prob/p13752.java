package boj.realize.prob;

import java.util.Scanner;

public class p13752 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while(n-->0) {
            int k = sc.nextInt();
            while(k-->0) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
