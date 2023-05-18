package boj.prefixsum.prob;

import java.util.*;

public class p28018 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[1000002];
        int b[] = new int[1000001];
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            a[sc.nextInt()]++;
            a[sc.nextInt() + 1]--;
        }
        
        for (int i=1; i<1000001; i++) {
            b[i] = b[i-1] + a[i];
        }
        
        int q = sc.nextInt();
        for (int i=0; i<q; i++) {
            System.out.println(b[sc.nextInt()]);
        }
    }
}
