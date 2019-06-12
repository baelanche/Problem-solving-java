package boj.backtrac.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p9663 {

	static int n;
    static int a[];
    static int cnt = 0;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        a = new int[n+1];
        
        for(int i=1; i<=n; i++) {
            a[1] = i;
            dfs(1);
        }
        
        System.out.println(cnt);
    }
    
    public static void dfs(int r) {
        if(r == n) {
            cnt++;
            return;
        }
        
        for(int i=1; i<=n; i++) {
            a[r+1] = i;
            if(setQueen(r+1))
                dfs(r+1);
        }
    }
    
    public static boolean setQueen(int r) {
        for(int i=1; i<r; i++) {
            if(a[i] == a[r])
                return false;
            if(Math.abs(a[i] - a[r]) == Math.abs(i - r))
                return false;
        }
        return true;
    }
}
