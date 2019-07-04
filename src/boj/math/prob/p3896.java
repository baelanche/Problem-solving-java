package boj.math.prob;

import java.util.Scanner;

public class p3896 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean prime[] = new boolean[1299710];
        for(int i=2; i<1299710; i++)
            for(int j=i; i*j>2 && i*j<1299710; j++)
                prime[i*j] = true;
        
        int t = sc.nextInt();
        while(t-->0) {
            int k = sc.nextInt();
            if(prime[k]) {
                int s = k;
                int e = k;
                while(true) {
                    if(!prime[--s]) break;
                }
                while(true) {
                    if(!prime[++e]) break;
                }
                System.out.println(e-s);
            } else System.out.println(0);
        }
    }
}
