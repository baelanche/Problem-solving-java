package boj.math.prob;

import java.util.Scanner;

public class p1009 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int c = a % 10;
            for(int i=0; i<b-1; i++) {
                c *= a;
                c %= 10;
            }
            System.out.println(c == 0 ? 10 : c);
        }
    }
}
