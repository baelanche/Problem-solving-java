package boj.dfs.prob;

import java.util.Scanner;

public class p11724 {

	int adj[][];
    boolean visited[];
    int n;
    
    p11724(int n) {
        this.n = n;
        adj = new int[n+1][n+1];
        visited = new boolean[n+1];
        visited[0] = true;
    }
    
    public void addEdge(int u, int v) {
        adj[u][v] = v;
        adj[v][u] = u;
    }
    
    public void dfs() {
        for(int i=1; i<=n; i++)
            visited[i] = false;
        dfs(1);
    }
    
    private int dfs(int curr) {
        int nodes = 1;
        visited[curr] = true;
        for(int next : adj[curr]) {
            if(!visited[next]) nodes += dfs(next);
        }
        return nodes;
    }
    
    public int dfsAll() {
        int components = 0;
        for(int i=1; i<=n; i++)
            visited[i] = false;
        for(int i=1; i<=n; i++) {
            if(!visited[i]) {
                int nodes = dfs(i);
                components++;
            }
        }
        return components;
    }
    
    public String toString() {
        String str = "";
        for(int i=1; i<=n; i++) {
            str += "[";
            for(int j=1; j<=n; j++) {
                str += adj[i][j];
                if(j != n)
                    str += ", ";
            }
            str += "]\n";
        }
        return str;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        p11724 g = new p11724(N);
        
        while(M-->0) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            
            g.addEdge(u, v);
        }
        
        System.out.println(g.dfsAll());
        sc.close();
    }
}

