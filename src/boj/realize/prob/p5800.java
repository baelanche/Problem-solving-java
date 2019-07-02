package boj.realize.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p5800 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int seq = 1;
        while(k-->0) {
            int n = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int gap = Integer.MIN_VALUE;
            int a[] = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
                max = Math.max(max, a[i]);
                min = Math.min(min, a[i]);
            }
            
            Arrays.sort(a);
            for(int i=1; i<n; i++)
                gap = Math.max(gap, Math.abs(a[i-1] - a[i]));
            
            System.out.println("Class " + seq);
            System.out.println("Max " + max + ", Min " + min + ", Largest gap " + gap);
            seq++;
        }
    }
}
