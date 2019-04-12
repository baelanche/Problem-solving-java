package boj.realize.prob;

import java.util.Scanner;

public class p2804 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        int x = 0;
        int y = 0;
        char c[][] = new char[b.length()][a.length()];
        
        for(int i=0; i<b.length(); i++) {
            for(int j=0; j<a.length(); j++) {
                c[i][j] = '.';
            }
        }
        
        boolean s = false;
        for(int i=0; i<a.length(); i++) {
            for(int j=0; j<b.length(); j++) {
                if(a.charAt(i) == b.charAt(j) && !s) {
                    s = true;
                    x = j; y = i;
                }
            }
        }
        
        c[x] = a.toCharArray();
        for(int i=0; i<b.length(); i++)
            c[i][y] = b.charAt(i);
        
        for(int i=0; i<b.length(); i++) {
            for(int j=0; j<a.length(); j++) {
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
