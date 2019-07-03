package boj.realize.prob;

import java.util.Scanner;

public class p11091 {

	public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        while(n-->0) {
            int alpha[] = new int[26];
            String s = sc.nextLine().toLowerCase();
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) >= 97 && s.charAt(i) <= 122)
                    alpha[s.charAt(i) - 97]++;
            }
            String temp = "";
            for(int i=0; i<26; i++)
                if(alpha[i] == 0)
                    temp += (char)(i + 97);
            
            System.out.println(temp.equals("") ? "pangram" : "missing " + temp);
        }
    }
}
