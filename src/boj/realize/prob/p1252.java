package boj.realize.prob;

import java.util.Scanner;

public class p1252 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String t1 = sc.next();
        String t2 = sc.next();
        if(t1.length() < t2.length()) {
            String temp = t1;
            t1 = t2;
            t2 = temp;
        }
        
        int diff = t1.length() - t2.length();
        while(diff-->0) {
            t2 = "0" + t2;
        }
        
        char a[] = t1.toCharArray();
        char b[] = t2.toCharArray();
        
        int h = 0;
        String s = "";
        for(int i=a.length-1; i>=0; i--) {
            int sum = (a[i] - '0') + (b[i] - '0') + h;
            if(sum == 3) {
                s = 1 + s;
                h = 1;
            } else if(sum == 2) {
                s = 0 + s;
                h = 1;
            } else if(sum == 1) {
                s = 1 + s;
                h = 0;
            } else {
                s = 0 + s;
                h = 0;
            }
        }
        s = h == 1 ? h + s : s;
        String ans = "";
        boolean one = true;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1')
                one = false;
            if(one) continue;
            ans += s.charAt(i);
        }
        System.out.println(ans.equals("") ? 0 : ans);
    }
}
