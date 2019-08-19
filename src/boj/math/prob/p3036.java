package boj.math.prob;

import java.util.Scanner;

public class p3036 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        for(int i=1; i<n; i++) {
            int gcd = gcd(a[0], a[i]);
            System.out.println(a[0]/gcd + "/" + a[i]/gcd);
        }
    }
    
    public static int gcd(int x, int y) {
        while(y != 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }
        return x;
    }
}