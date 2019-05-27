package boj.tree.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class p11725 {

	static int parents[];
    static ArrayList<ArrayList<Integer>> nodes;
    static boolean visited[];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        parents = new int[n+1];
        visited = new boolean[n+1];
        nodes = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n+1; i++)
            nodes.add(new ArrayList<Integer>());
        
        for(int i=1; i<n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            nodes.get(a).add(b);
            nodes.get(b).add(a);
        }
        
        dfs(1, 0);
        for(int i=2; i<n+1; i++) System.out.println(parents[i]);
    }
    
    public static void dfs(int node, int parent) {
        visited[node] = true;
        parents[node] = parent;
        for(int item : nodes.get(node)) {
            if(item != node && !visited[item]) dfs(item, node);
        }
    }
}
