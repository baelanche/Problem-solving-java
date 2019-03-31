package boj.bruteforce.prob;

import java.util.Scanner;

public class p2503 {

	public static String[] base;
    public static String[] s;
    public static String[] b;
    public static int cnt = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        base = new String[t];
        s = new String[t];
        b = new String[t];
        
        for(int i=0; i<t; i++) {
            base[i] = sc.next();
            s[i] = sc.next();
            b[i] = sc.next();
        }
        
        for(int i=123; i<=987; i++) {
            check(String.valueOf(i));
        }
        
        System.out.println(cnt);
    }
    
    public static void check(String arr) {
        char[] charArr = arr.toCharArray();
        int eq = 0;
        
        for(int i=0; i<base.length; i++) {
            if(charArr[0] == charArr[1] || charArr[0] == charArr[2] || charArr[1] == charArr[2] ||
              charArr[0] == '0' || charArr[1] == '0' || charArr[2] == '0')
                continue;
            int str = 0;
            int bal = 0;
            for(int j=0; j<3; j++) {
                for(int k=0; k<3; k++) {
                    if(charArr[j] == base[i].charAt(k)) {
                        if(j == k) str++;
                        else bal++;
                    }
                }
            }
            if(str == Integer.parseInt(s[i]) && bal == Integer.parseInt(b[i]))
                eq++;
        }
        if(eq == base.length)
                cnt++;
    }
}
