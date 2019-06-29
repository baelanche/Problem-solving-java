package boj.realize.prob;

import java.util.Scanner;

public class p2902 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        System.out.print(s.charAt(0));
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == '-')
                System.out.print(s.charAt(i+1));
        }
    }
}
