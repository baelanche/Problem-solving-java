package boj.tree.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p4803 {

	static int tree[][];
    static boolean visited[];
    static boolean vertexes[];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for(int c=1; true; c++) {
            String nm[] = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            if(n == 0 && m == 0) break;
            
            tree = new int[n+1][n+1];
            visited = new boolean[n+1];
            vertexes = new boolean[n+1];
            for(int i=0; i<m; i++) {
                String uv[] = br.readLine().split(" ");
                int u = Integer.parseInt(uv[0]);
                int v = Integer.parseInt(uv[1]);
                tree[u][v] = v;
                tree[v][u] = u;
            }
            
            int result = 0;
            for(int i=1; i<=n; i++) {
                if(!visited[i]) {
                    int v = vertex(i);
                    int e = edge(i);
                    if(v-1 == e/2) result++;
                }
            }
            System.out.println(result == 0 ?
                              "Case " + c + ": No trees." : result == 1 ?
                              "Case " + c + ": There is one tree." :
                              "Case " + c + ": A forest of " + result + " trees.");
        }
    }
    
    public static int vertex(int node) {
        int cnt = 1;
        visited[node] = true;
        
        for(int i=1; i<tree.length; i++) {
            int child = tree[node][i];
            if(child != 0 && !visited[child])
                cnt += vertex(child);
        }
        return cnt;
    }
    
    public static int edge(int node) {
        int cnt = 0;
        for(int i=1; i<tree.length; i++) {
            if(tree[node][i] != 0) cnt++;
        }
        vertexes[node] = true;
        
        for(int i=1; i<tree.length; i++) {
            int child = tree[node][i];
            if(child != 0 && !vertexes[child])
                cnt += edge(child);
        }
        return cnt;
    }
}
