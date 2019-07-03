package boj.realize.prob;

import java.util.Scanner;

public class p3028 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int a = 1;
        int b = 0;
        int c = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'A') {
                int temp = a;
                a = b;
                b = temp;
            }
            if(s.charAt(i) == 'B') {
                int temp = b;
                b = c;
                c = temp;
            }
            if(s.charAt(i) == 'C') {
                int temp = c;
                c = a;
                a = temp;
            }
        }
        System.out.println(a == 1 ? 1 : b == 1 ? 2 : 3);
    }
}
