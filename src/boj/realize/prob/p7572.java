package boj.realize.prob;

import java.util.Scanner;

public class p7572 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int k = 0;
        for(int i=1; i<=n; i+=60) k = i;
        
        char c = 'J';
        int seq = 7;
        if(k == n) System.out.println(c + "" + seq);
        else {
            for(int i=k+1; i<=n; i++) {
                c = (char)((c - 'A' + 1) % 12 + 'A');
                seq = (seq + 1) % 10;
            }
            System.out.println(c + "" + seq);
        }
    }
}
