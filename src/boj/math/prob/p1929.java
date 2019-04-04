package boj.math.prob;

import java.util.Scanner;

public class p1929 {
	    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int prime[] = new int[n+1];
        prime[1] = 0;
        for(int i=2; i<=n; i++)
            prime[i] = 1;
        
        for(int i=2; i<=n; i++) {
            for(int j=2; j<=n; j++) {
                if(i*j > n)
                    break;
                prime[i*j] = 0;
            }
        }
        
        for(int i=m; i<=n; i++) {
            if(prime[i] == 1)
                System.out.println(i);
        }
        
        sc.close();
    }
}
