package boj.realize.prob;

import java.util.Scanner;

public class p8320 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int cnt = 0;
        if(n==1) cnt = 1;
        for(int i=1; i<=n/2; i++) {
            for(int j=i; j<=n; j++) {
                if(i*j <= n)
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
