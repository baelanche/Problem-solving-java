package boj.dfs.prob;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p1260 {

	static int n;
    static int m;
    static int a[][];
    static boolean visited[];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n+1][n+1];
        visited = new boolean[n+1];
        int V = sc.nextInt();
        for(int i=0; i<m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            a[u][v] = 1;
            a[v][u] = 1;
        }
        
        dfs(V);
        Arrays.fill(visited, false);
        System.out.println();
        bfs(V);
        sc.close();
    }
    
    public static void dfs(int x) {
        visited[x] = true;
        System.out.print(x + " ");
        for(int i=1; i<=n; i++) {
            if(a[x][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
    
    public static void bfs(int x) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(x);
        visited[x] = true;
        while(!q.isEmpty()) {
            int curr = q.peek();
            System.out.print(q.poll() + " ");
            for(int i=1; i<=n; i++) {
                if(a[curr][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}
