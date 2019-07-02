package boj.realize.prob;

import java.util.Scanner;

public class p2460 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        int people = 0;
        for(int i=0; i<10; i++) {
            people -= sc.nextInt();
            people += sc.nextInt();
            max = Math.max(max, people);
        }
        System.out.println(max);
    }
}
