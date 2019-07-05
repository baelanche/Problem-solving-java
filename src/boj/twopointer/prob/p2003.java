package boj.twopointer.prob;

import java.util.Scanner;

public class p2003 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        int s = 0;
        int e = 0;
        int sum = 0;
        int result = 0;
        while(true) {
            if(sum >= m) sum -= a[s++];
            else if(e == n) break;
            else sum += a[e++];
            if(sum == m) result++;
        }
        System.out.println(result);
    }
}
