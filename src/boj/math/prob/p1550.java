package boj.math.prob;

import java.util.Scanner;

public class p1550 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int sum = 0;
        int m = 1;
        for(int i=s.length()-1; i>=0; i--) {
            int idx = 0;
            if(s.charAt(i) == 'A') idx = 10;
            else if(s.charAt(i) == 'B') idx = 11;
            else if(s.charAt(i) == 'C') idx = 12;
            else if(s.charAt(i) == 'D') idx = 13;
            else if(s.charAt(i) == 'E') idx = 14;
            else if(s.charAt(i) == 'F') idx = 15;
            else idx = s.charAt(i) - '0';
            
            idx *= m;
            m *= 16;
            sum += idx;
        }
        System.out.println(sum);
    }
}
