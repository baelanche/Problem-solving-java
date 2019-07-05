package boj.backtrac.prob;

import java.util.Scanner;

public class p10974 {

	static int n;
    static boolean visited[];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        visited = new boolean[n+1];
        
        dfs(0, "");
    }
    
    public static void dfs(int cnt, String s) {
        if(cnt == n) {
            System.out.println(s);
            return;
        }
        
        for(int i=1; i<=n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(cnt+1, s + i + " ");
                visited[i] = false;
            }
        }
    }
}
