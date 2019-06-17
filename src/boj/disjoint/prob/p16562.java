package boj.disjoint.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p16562 {

static int a[];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        a = new int[n+1];
        int cost[] = new int[n+1];
        Pair root[] = new Pair[n+1];
        for(int i=1; i<=n; i++)
            root[i] = new Pair(i, 0);
        Arrays.fill(a, -1);
        
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++)
            cost[i] = Integer.parseInt(st.nextToken());
        
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            union(v, w);
        }
        
        
        for(int i=1; i<=n; i++) {
            int r = find(i);
            root[r].idx = r;
            if(root[r].cost == 0) root[r].cost = cost[i];
            else root[r].cost = Math.min(root[r].cost, cost[i]);
        }
        
        int total = 0;
        for(int i=1; i<=n; i++) {
            if(root[i].cost != 0)
                total += root[i].cost;
        }
        if(k >= total)
            System.out.println(total);
        else
            System.out.println("Oh no");
    }
    
    public static int find(int n) {
        if(a[n] < 0) return n;
        a[n] = find(a[n]);
        return a[n];
    }
    
    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if(x == y) return;
        a[x] += a[y];
        a[y] = x;
    }
    
    static class Pair {
        int idx;
        int cost;
        
        Pair(int idx, int cost) {
            this.idx = idx;
            this.cost = cost;
        }
    }
}
