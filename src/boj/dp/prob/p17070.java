package boj.dp.prob;

import java.util.*;
import java.io.*;

public class p17070 {
    
    static int n;
    static int a[][];
    static int ans = 0;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());
        a = new int[n+1][n+1];
        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++)
                a[i][j] = Integer.parseInt(st.nextToken());
        }
        
        bfs();
        System.out.println(ans);
    }
    
    public static void bfs() {
        Queue<Pair> q = new LinkedList<Pair>();
        q.offer(new Pair(1, 1, 1, 2, 0));
        
        while(!q.isEmpty()) {
            
            int size = q.size();
            while(size-->0) {
                Pair p = q.poll();
                int position = p.position;
                if(p.x2 == n && p.y2 == n) ans++;
                //가로
                if(position == 0) {
                    if(p.y2 + 1 <= n && a[p.x2][p.y2+1] == 0)
                        q.offer(new Pair(p.x1, p.y1+1, p.x2, p.y2+1, 0));
                    if(p.x2 + 1 <= n && p.y2 + 1 <= n && a[p.x2][p.y2+1] == 0 && a[p.x2+1][p.y2] == 0 && a[p.x2+1][p.y2+1] == 0)
                        q.offer(new Pair(p.x1, p.y1+1, p.x2+1, p.y2+1, 2));
                }
                //세로
                if(position == 1) {
                    if(p.x2 + 1 <= n && a[p.x2+1][p.y2] == 0)
                        q.offer(new Pair(p.x1+1, p.y1, p.x2+1, p.y2, 1));
                    if(p.x2 + 1 <= n && p.y2 + 1 <= n && a[p.x2][p.y2+1] == 0 && a[p.x2+1][p.y2] == 0 && a[p.x2+1][p.y2+1] == 0)
                        q.offer(new Pair(p.x1+1, p.y1, p.x2+1, p.y2+1, 2));
                }
                //대각선
                if(position == 2) {
                    if(p.y2+1 <= n && a[p.x2][p.y2+1] == 0)
                        q.offer(new Pair(p.x1+1, p.y1+1, p.x2, p.y2+1, 0));
                    if(p.x2+1 <= n && a[p.x2+1][p.y2] == 0)
                        q.offer(new Pair(p.x1+1, p.y1+1, p.x2+1, p.y2, 1));
                    if(p.x2+1 <= n && p.y2+1 <= n && a[p.x2][p.y2+1] == 0 && a[p.x2+1][p.y2] == 0 && a[p.x2+1][p.y2+1] == 0)
                        q.offer(new Pair(p.x1+1, p.y1+1, p.x2+1, p.y2+1, 2));
                }
            }
        }
    }
    
    static class Pair {
        int x1;
        int y1;
        int x2;
        int y2;
        int position;
        
        Pair(int x1, int y1, int x2, int y2, int position) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.position = position;
        }
    }
}