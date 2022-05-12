package boj.greedy;

import java.util.*;

public class p13305 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d[] = new int[n-1];
        int m[] = new int[n];
        
        for (int i=0; i<n-1; i++) d[i] = sc.nextInt();
        for (int i=0; i<n; i++) m[i] = sc.nextInt();
        
        int pos = 0;
        long dis = 0;
        long money = 0;
        for (int i=0; i<n-1; i++) {
            if (m[pos] > m[i]) {
                money += m[pos] * dis;
                dis = 0;
                pos = i;
            }
            dis += d[i];
        }
        money += m[pos] * dis;
        System.out.println(money);
    }
}
