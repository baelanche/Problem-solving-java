package boj.backtrac.prob;

import java.util.Scanner;

public class p14888 {

	static int n;
    static int a[];
    static int oper[];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        a = new int[n];
        oper = new int[4];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        for(int i=0; i<4; i++)
            oper[i] = sc.nextInt();
        
        dfs(1, a[0]);
        
        System.out.println(max);
        System.out.println(min);
    }
    
    public static void dfs(int cnt, int n) {
        if(cnt == p14888.n) {
            max = Math.max(max, n);
            min = Math.min(min, n);
            return;
        }
        
        if(oper[0] > 0) {
            oper[0]--;
            dfs(cnt + 1, n + a[cnt]);
            oper[0]++;
        }
        
        if(oper[1] > 0) {
            oper[1]--;
            dfs(cnt + 1, n - a[cnt]);
            oper[1]++;
        }
        
        if(oper[2] > 0) {
            oper[2]--;
            dfs(cnt + 1, n * a[cnt]);
            oper[2]++;
        }
        
        if(oper[3] > 0) {
            oper[3]--;
            dfs(cnt + 1, n / a[cnt]);
            oper[3]++;
        }
    }
}
