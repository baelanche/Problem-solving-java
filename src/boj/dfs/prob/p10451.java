package boj.dfs.prob;

import java.util.Scanner;

public class p10451 {

	static int n;
    static int a[];
    static boolean visited[];
    static int cnt = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt();
            a = new int[n+1];
            visited = new boolean[n+1];
            for(int i=1; i<=n; i++)
                a[i] = sc.nextInt();
            
            for(int i=1; i<=n; i++)
                if(!visited[i])
                    dfs(i);
            
            System.out.println(cnt);
            cnt = 0;
        }
    }
    
    public static void dfs(int x) {
        if(!visited[x]) {
            visited[x] = true;
            dfs(a[x]);
        } else cnt++;
    }
}
