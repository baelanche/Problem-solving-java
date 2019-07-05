package boj.twopointer.prob;

import java.util.Scanner;

public class p1806 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int s = sc.nextInt();
        
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        int min = Integer.MAX_VALUE;
        int lo = 0;
        int hi = 0;
        int sum = 0;
        while(true) {
            if(sum >= s) {
                sum -= a[lo++];
                min = Math.min(min, hi-lo+1);
            } else if(hi == n) break;
            else sum += a[hi++];
        }
        System.out.println(min == Integer.MAX_VALUE ? 0 : min);
    }
}
