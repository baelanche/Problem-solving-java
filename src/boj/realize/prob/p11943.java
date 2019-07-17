package boj.realize.prob;

import java.util.Scanner;

public class p11943 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a1 = sc.nextInt();
        int o1 = sc.nextInt();
        int a2 = sc.nextInt();
        int o2 = sc.nextInt();
        
        System.out.println(Math.min(a1+o2, a2+o1));
    }
}
