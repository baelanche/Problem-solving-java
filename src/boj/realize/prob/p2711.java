package boj.realize.prob;

import java.util.Scanner;

public class p2711 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            int idx = sc.nextInt();
            String s = sc.next();
            System.out.println(s.substring(0, idx-1) + s.substring(idx, s.length()));
        }
    }
}
