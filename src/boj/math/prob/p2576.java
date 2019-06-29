package boj.math.prob;

import java.util.Scanner;

public class p2576 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0; i<7; i++) {
            int a = sc.nextInt();
            if(a % 2 != 0) {
                sum += a;
                min = Math.min(min, a);
            }
        }
        
        if(sum == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
