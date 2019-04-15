package boj.realize.prob;

import java.util.Scanner;

public class p1188 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.println(m - gcd(n, m));
        sc.close();
    }
    
    public static int gcd(int x, int y) {
        while(y != 0) {
            int tmp = y;
            y = x%y;
            x = tmp;
        }
        return x;
    }
}
