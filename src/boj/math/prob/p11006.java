package boj.math.prob;

import java.util.Scanner;

public class p11006 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = m*2 - n;
            System.out.println(x + " " + (m-x));
        }
    }
}
