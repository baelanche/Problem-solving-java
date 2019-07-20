package boj.realize.prob;

import java.util.Scanner;

public class p13416 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int profit = 0;
            for(int i=0; i<n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int max = Math.max(Math.max(a, b), c);
                if(max > 0) profit += max;
            }
            System.out.println(profit);
        }
    }
}
