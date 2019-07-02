package boj.realize.prob;

import java.util.Scanner;

public class p12833 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        while(c-->0) {
            a = a^b;
        }
        System.out.println(a);
    }
}
