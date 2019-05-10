package boj.dfs.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p2606 {

	static int n;
    static int a[][];
    static boolean visited[];
    static Queue<Integer> q = new LinkedList<Integer>();
    static int cnt = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        a = new int[n+1][n+1];
        visited = new boolean[n+1];
        int m = sc.nextInt();
        while(m-->0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x][y] = y;
            a[y][x] = x;
        }
        
        visited[1] = true;
        dfs(1);
        System.out.println(cnt);
    }
    
    public static void dfs(int x) {
        for(int i=1; i<=n; i++) {
            if(a[x][i] != 0 && !visited[i]) {
                visited[i] = true;
                q.offer(a[x][i]);
                cnt++;
            }
        }
        while(!q.isEmpty()) {
            dfs(q.poll());
        }
    }
}
