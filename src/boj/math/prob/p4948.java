package boj.math.prob;

import java.util.Scanner;

public class p4948 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int prime[] = new int[246913];
        for(int i=0; i<prime.length; i++)
            prime[i] = 1;
        prime[1] = 0;
        
        for(int i=2; i<=123456; i++) {
            for(int j=2; i*j<=prime.length; j++) {
                prime[i*j] = 0;
            }
        }
        
        while(true) {
            int n = sc.nextInt();
            if(n == 0) break;
            
            int cnt = 0;
            for(int i=n+1; i<=2*n; i++) {
                if(prime[i] == 1)
                    cnt++;
            }
            System.out.println(cnt);
        }
        
        sc.close();
    }
}
