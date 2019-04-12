package boj.realize.prob;

import java.util.Scanner;

public class p10409 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a[] = new int[n];
        int cnt = 0;
        
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            t -= a[i];
            if(t < 0) break;
            cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}
