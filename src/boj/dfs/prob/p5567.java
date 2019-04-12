package boj.dfs.prob;

import java.util.ArrayList;
import java.util.Scanner;

public class p5567 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n+1][n+1];
        boolean visited[] = new boolean[n+1];
        ArrayList<Integer> f = new ArrayList<Integer>();
        int cnt = 0;
        
        for(int i=0; i<m; i++) {
            int an = sc.nextInt();
            int bn = sc.nextInt();
            
            a[an][bn] = 1;
            a[bn][an] = 1;
            
            if(an == 1) {
                cnt++;
                f.add(bn);
                visited[bn] = true;
            }
        }
        
        for(int i : f) {
            for(int j=2; j<=n; j++) {
                if(a[i][j] == 1 && !visited[j]) {
                    cnt++;
                    visited[j] = true;
                }
            }
        }
        
        System.out.println(cnt);
        sc.close();
    }
}
