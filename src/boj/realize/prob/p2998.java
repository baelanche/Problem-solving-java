package boj.realize.prob;

import java.util.Scanner;

public class p2998 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        while(s.length() % 3 != 0) {
            s = "0" + s;
        }
        
        String ans = "";
        for(int i=s.length()-1; i>=0; i-=3) {
            char a = s.charAt(i-2);
            char b = s.charAt(i-1);
            char c = s.charAt(i);
            if(a == '0' && b == '0' && c == '0') ans = 0 + ans;
            if(a == '0' && b == '0' && c == '1') ans = 1 + ans;
            if(a == '0' && b == '1' && c == '0') ans = 2 + ans;
            if(a == '0' && b == '1' && c == '1') ans = 3 + ans;
            if(a == '1' && b == '0' && c == '0') ans = 4 + ans;
            if(a == '1' && b == '0' && c == '1') ans = 5 + ans;
            if(a == '1' && b == '1' && c == '0') ans = 6 + ans;
            if(a == '1' && b == '1' && c == '1') ans = 7 + ans;
        }
        System.out.println(ans);
    }
}
