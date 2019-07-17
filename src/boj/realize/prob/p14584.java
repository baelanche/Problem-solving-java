package boj.realize.prob;

import java.util.Scanner;

public class p14584 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cipher = sc.next();
        
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i=0; i<n; i++)
            s[i] = sc.next();
        
        for(int i=0; i<26; i++) {
            String temp = "";
            for(int j=0; j<cipher.length(); j++)
                temp += (char)((cipher.charAt(j) - 'a' + i) % 26 + 'a');
            
            for(int j=0; j<n; j++) {
                if(temp.contains(s[j])) {
                    System.out.println(temp);
                    return;
                }
            }
        }
    }
}
