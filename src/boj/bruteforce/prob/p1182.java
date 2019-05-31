package boj.bruteforce.prob;

import java.util.Scanner;

public class p1182 {

	static int n;
    static int s;
    static int a[];
    static int cnt = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        s = sc.nextInt();
        a = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        recursive(0, 0);
        System.out.println(cnt);
    }
    
    public static void recursive(int idx, int sum) {
        if(idx >= n) return;
        sum += a[idx];
        if(sum == s) cnt++;
        
        recursive(idx + 1, sum - a[idx]);
        recursive(idx + 1, sum);
    }
}
