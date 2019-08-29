package boj.realize.prob;

import java.util.Scanner;

public class p10214 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0) {
            int y = 0;
            int k = 0;
            for(int i=0; i<9; i++) {
                y += sc.nextInt();
                k += sc.nextInt();
            }
            System.out.println(y > k ? "Yonsei" : y == k ? "Draw" : "Korea");
        }
    }
}
