package boj.realize.prob;

import java.util.Scanner;

public class p3062 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String s = String.valueOf(n);
            String reverseS = "";
            for(int i=0; i<s.length(); i++)
                reverseS = s.charAt(i) + reverseS;
            int reverseN = Integer.parseInt(reverseS);
            
            int sum = n + reverseN;
            String ss = String.valueOf(sum);
            String reverseSS = "";
            for(int i=0; i<ss.length(); i++)
                reverseSS = ss.charAt(i) + reverseSS;
            int reverseSum = Integer.parseInt(reverseSS);
            
            System.out.println(sum == reverseSum ? "YES" : "NO");
        }
    }
}
