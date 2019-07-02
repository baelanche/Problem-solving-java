package boj.realize.prob;

import java.util.Scanner;

public class p5586 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int joi = 0;
        int ioi = 0;
        for(int i=0; i<s.length()-2; i++) {
            if(s.charAt(i) == 'J' && s.charAt(i+1) == 'O' && s.charAt(i+2) == 'I') joi++;
            if(s.charAt(i) == 'I' && s.charAt(i+1) == 'O' && s.charAt(i+2) == 'I') ioi++;
        }
        System.out.println(joi);
        System.out.println(ioi);
    }
}
