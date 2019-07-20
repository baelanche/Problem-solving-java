package boj.realize.prob;

import java.util.Scanner;

public class p13419 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            String s = sc.next();
            for(int i=0; i<2; i++) {
                int alpha[] = new int[26];
                String result = "";
                int idx = i % s.length();
                while(true) {
                    if(alpha[s.charAt(idx) - 'A'] == 1) break;
                    result += s.charAt(idx);
                    alpha[s.charAt(idx) - 'A']++;
                    idx = (idx + 2) % s.length();
                }
                System.out.println(result);
            }
        }
    }
}
