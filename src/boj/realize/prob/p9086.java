package boj.realize.prob;

import java.util.Scanner;

public class p9086 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            String s = sc.next();
            System.out.println(s.charAt(0) + "" + s.charAt(s.length()-1));
        }
    }
}
