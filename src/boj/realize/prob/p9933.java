package boj.realize.prob;

import java.util.Scanner;

public class p9933 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i=0; i<n; i++)
            s[i] = sc.next();
        
        boolean success = false;
        for(int i=0; i<n; i++) {
            String a = s[i];
            for(int j=0; j<n; j++) {
                String b = "";
                for(int k=0; k<s[j].length(); k++)
                    b = s[j].charAt(k) + b;
                
                if(a.equals(b)) {
                    System.out.println(a.length() + " " + a.charAt(a.length()/2));
                    success = true;
                    break;
                }
            }
            if(success) break;
        }
    }
}
