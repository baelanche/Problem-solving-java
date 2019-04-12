package boj.realize.prob;

import java.util.Scanner;

public class p2909 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double c = sc.nextLong();
        int k = sc.nextInt();
        long pow = (long)Math.pow(10, k);
        c /= pow;
        c = Math.round(c);
        c *= pow;
        
        System.out.println((long)c);
        sc.close();
    }
}
