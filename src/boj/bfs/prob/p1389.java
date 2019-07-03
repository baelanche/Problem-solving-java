package boj.bfs.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1389 {

	static int n;
    static int a[][];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        a = new int[n+1][n+1];
        
        while(m-->0) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int u = Integer.parseInt(st.nextToken());
            
            a[v][u] = 1;
            a[u][v] = 1;
        }
        
        int seq = 0;
        int min = Integer.MAX_VALUE;
        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=1; j<=n; j++)
                sum += bfs(i, j);
            
            if(min > sum) {
                min = sum;
                seq = i;
            }
        }
        System.out.println(seq);
    }
    
    public static int bfs(int s, int e) {
        Queue<Integer> q = new LinkedList<Integer>();
        
        q.offer(s);
        int cnt = 0;
        boolean find = false;
        while(!q.isEmpty()) {
            int size = q.size();
            
            while(size-->0) {
                int p = q.poll();
                if(p == e) {
                    find = true;
                    break;
                }
                for(int i=1; i<=n; i++)
                    if(a[p][i] == 1)
                        q.offer(i);
            }
            if(find) break;
            cnt++;
        }
        return cnt;
    }
}
