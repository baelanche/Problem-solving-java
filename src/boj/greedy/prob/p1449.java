package boj.greedy.prob;

import java.util.Scanner;

public class p1449 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int l = sc.nextInt();
        
        int a[] = new int[1001];
        for(int i=0; i<n; i++) {
            int p = sc.nextInt();
            a[p] = 1;
        }
        
        int cnt = 0;
        for(int i=1; i<a.length; i++) {
            if(a[i] == 1) {
                int len = i + l;
                for(int j=i; j<len && j <= 1000; j++)
                    a[j] = 0;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
