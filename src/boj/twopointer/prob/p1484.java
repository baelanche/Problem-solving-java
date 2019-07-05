package boj.twopointer.prob;

import java.util.Scanner;

public class p1484 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int g = sc.nextInt();
        
        int lo = 1;
        int hi = 1;
        boolean f = false;
        while(true) {
            long minus = (long)(Math.pow(hi, 2)) - (long)(Math.pow(lo, 2));
            if(hi - lo == 1 && minus > g) break;
            if(minus >= g) lo++;
            else hi++;
            if(minus == g) {
                System.out.println(hi);
                f = true;
            }
        }
        if(!f) System.out.println(-1);
    }
}
