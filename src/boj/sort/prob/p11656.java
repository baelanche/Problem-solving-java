package boj.sort.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p11656 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        String a[] = new String[s.length()];
        for(int i=0; i<s.length(); i++)
            a[i] = s.substring(i, s.length());
        
        Arrays.sort(a);
        
        for(int i=0; i<s.length(); i++)
            System.out.println(a[i]);
    }
}
