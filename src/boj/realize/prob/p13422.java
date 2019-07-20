package boj.realize.prob;

import java.util.Scanner;

public class p13422 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++)
                a[i] = sc.nextInt();
            int psum[] = new int[n+m];
            for(int i=1; i<n+m; i++)
                psum[i] = psum[i-1] + a[(i-1)%n];
            
            int cnt = 0;
            
            if(n == m) {
                if(psum[n] < k) cnt++;
            } else {
                for(int i=m; i<n+m; i++)
                    if(psum[i] - psum[i-m] < k)
                        cnt++;
            }
            System.out.println(cnt);
        }
    }
}
