package boj.math.prob;

import java.util.Scanner;

public class p9020 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int prime[] = new int[10001];
        for(int i=2; i<=10000; i++)
            for(int j=2; i*j<=10000; j++)
                prime[i*j] = 1;
        
        while(t-->0) {
            int n = sc.nextInt();
            
            for(int i=n/2; i>0; i--) {
                if(prime[i] == 0 && prime[n-i] == 0) {
                    System.out.println(i + " " + (n-i));
                    break;
                }
            }
        }
    }
	
}
