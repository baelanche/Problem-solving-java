package boj.math.prob;

import java.util.Scanner;

public class p14490 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int a = Integer.parseInt(s.split(":")[0]);
        int b = Integer.parseInt(s.split(":")[1]);
        
        int len = a > b ? b : a;
        
        for(int i=2; i<=len; i++) {
            if(a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
                i = 1;
            }
        }
        System.out.println(a + ":" + b);
    }
}
