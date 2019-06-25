package boj.realize.prob;

import java.util.Scanner;

public class p2562 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        int maxIdx = 0;
        for(int i=1; i<=9; i++) {
            int n = sc.nextInt();
            max = Math.max(max, n);
            maxIdx = max == n ? i : maxIdx;
        }
        System.out.println(max);
        System.out.println(maxIdx);
    }
}
