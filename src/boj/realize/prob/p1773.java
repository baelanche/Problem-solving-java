package boj.realize.prob;

import java.util.Scanner;

public class p1773 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int c = sc.nextInt();
        int a[] = new int[c+1];
        
        int cnt = 0;
        for(int i=0; i<n; i++) {
            int p = sc.nextInt();
            for(int j=p; j<=c; j+=p) {
                if(a[j] == 0) {
                    a[j] = 1;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
