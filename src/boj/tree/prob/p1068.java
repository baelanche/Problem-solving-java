package boj.tree.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1068 {

	static ArrayList<Integer>[] tree;
    static int[] parents;
    static boolean[] visited;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        tree = new ArrayList[n+1];
        parents = new int[n];
        visited = new boolean[n];
        for(int i=0; i<n+1; i++)
            tree[i] = new ArrayList<Integer>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int node=0; node<n; node++) {
            int parent = Integer.parseInt(st.nextToken());
            parents[node] = parent;
        }
        
        int root = 0;
        for(int i=0; i<n; i++) {
            int v = parents[i];
            if(v == -1) {
                root = i;
                continue;
            }
            tree[v].add(i);
            tree[i].add(v);
        }
        
        int remove = Integer.parseInt(br.readLine());
        bfs(remove);
        System.out.println(bfs(root));
    }
    
    public static int bfs(int remove) {
        Queue<Integer> q = new LinkedList<Integer>();
        int cnt = 0;
        if(visited[remove]) return cnt;
        
        q.offer(remove);
        visited[remove] = true;
        
        while(!q.isEmpty()) {
            remove = q.poll();
            boolean f = false;
            for(int next : tree[remove]) {
                if(!visited[next] && parents[remove] != next) {
                    f = true;
                    q.offer(next);
                    visited[next] = true;
                }
            }
            if(!f) cnt++;
        }
        return cnt;
    }
}
