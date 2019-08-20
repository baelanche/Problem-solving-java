package boj.realize.prob;

import java.util.Scanner;

public class p5598 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] c = sc.next().toCharArray();
        
        for(int i=0; i<c.length; i++)
            System.out.print((c[i] - 3) < 65 ? (char)(90 - (65 - (c[i] - 3) - 1)) : (char)(c[i] - 3));
    }
}
