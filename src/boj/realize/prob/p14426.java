package boj.realize.prob;

import java.util.Scanner;

public class p14426 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        String a[] = new String[n];
        for(int i=0; i<n; i++)
            a[i] = sc.next();
        
        int cnt = 0;
        while(m-->0) {
            String s = sc.next();
            for(int i=0; i<n; i++)
                if(a[i].startsWith(s)) {
                    cnt++;
                    break;
                }
        }
        System.out.println(cnt);
    }
}
