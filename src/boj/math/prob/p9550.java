package boj.math.prob;

import java.util.Scanner;

public class p9550 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int cnt = 0;
            while(n-->0) {
                int a = sc.nextInt();
                cnt += a/k;
            }
            System.out.println(cnt);
        }
    }
}
