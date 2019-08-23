package boj.realize.prob;

import java.util.Scanner;

public class p10103 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int c = 100;
        int s = 100;
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a > b) s -= a;
            if(a < b) c -= b;
        }
        
        System.out.println(c);
        System.out.println(s);
    }
}
