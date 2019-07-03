package boj.realize.prob;

import java.util.Scanner;

public class p4447 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0) {
            String s = sc.nextLine();
            int g = 0;
            int b = 0;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == 'g' || s.charAt(i) == 'G') g++;
                if(s.charAt(i) == 'b' || s.charAt(i) == 'B') b++;
            }
            System.out.println(g > b ? s + " is GOOD" : g == b ? s + " is NEUTRAL" : s + " is A BADDY");
        }
    }
}
