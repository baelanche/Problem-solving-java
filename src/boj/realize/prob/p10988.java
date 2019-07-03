package boj.realize.prob;

import java.util.Scanner;

public class p10988 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        String temp = "";
        for(int i=0; i<s.length(); i++)
            temp = s.charAt(i) + temp;
        
        System.out.println(s.equals(temp) ? 1 : 0);
    }
}
