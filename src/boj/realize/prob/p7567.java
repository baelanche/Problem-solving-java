package boj.realize.prob;

import java.util.Scanner;

public class p7567 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int height = 10;
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i-1) != s.charAt(i))
                height += 10;
            else height += 5;
        }
        System.out.println(height);
    }
}
