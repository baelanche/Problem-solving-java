package boj.divide.prob;

import java.util.Scanner;

public class p1074 {

	static int idx = 0;
    static int r;
    static int c;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int pow = (int)Math.pow(2, n);
        r = sc.nextInt();
        c = sc.nextInt();
        
        recursive(0, 0, pow);
    }
    
    public static void recursive(int s, int e, int len) {
        if (len == 1) {
            System.out.println(idx);
            return;
        }

        int m = len/2;
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                if (s + m*i <= r && r < s + m*(i+1) && e + m*j <= c && c < e + m*(j+1)) {
                    recursive(s + m*i, e + m*j, m);
                }
                idx += m * m;
            }
        }
    }
}
