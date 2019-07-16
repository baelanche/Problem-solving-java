package boj.math.prob;

import java.util.Scanner;

public class p2869 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        
        System.out.println((v-b)%(a-b) == 0 ? (v-b)/(a-b) : (v-b)/(a-b) + 1);
    }
}
