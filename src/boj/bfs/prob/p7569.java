package boj.bfs.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p7569 {

	static int m;
    static int n;
    static int h;
    static int a[][][];
    static Queue<Pair> q = new LinkedList<Pair>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        m = sc.nextInt();
        n = sc.nextInt();
        h = sc.nextInt();
        
        a = new int[h][n][m];
        
        for(int i=0; i<h; i++)
            for(int j=0; j<n; j++)
                for(int k=0; k<m; k++) {
                    a[i][j][k] = sc.nextInt();
                    if(a[i][j][k] == 1) q.offer(new Pair(i, j, k));
                }
        
        System.out.println(bfs());
    }
    
    public static int bfs() {
        int cnt = -1;
        
        while(!q.isEmpty()) {
            int size = q.size();
            
            while(size-->0) {
                int dh[] = {0, 0, 0, 0, -1, 1};
                int dn[] = {-1, 1, 0, 0, 0, 0};
                int dm[] = {0, 0, -1, 1, 0, 0};
                
                Pair p = q.poll();
                int mh = p.h;
                int mn = p.n;
                int mm = p.m;
                for(int i=0; i<6; i++) {
                    int nh = mh + dh[i];
                    int nn = mn + dn[i];
                    int nm = mm + dm[i];
                    if(0 <= nh && nh < h && 0 <= nn && nn < n && 0 <= nm && nm < m) {
                        if(a[nh][nn][nm] == 0) {
                            q.offer(new Pair(nh, nn, nm));
                            a[nh][nn][nm] = 1;
                        }
                    }
                }
            }
            cnt++;
        }
        
        for(int i=0; i<h; i++)
            for(int j=0; j<n; j++)
                for(int k=0; k<m; k++)
                    if(a[i][j][k] == 0)
                        return -1;
        
        return cnt;
    }
    
    static class Pair {
        int h;
        int n;
        int m;
        
        Pair(int h, int n, int m) {
            this.h = h;
            this.n = n;
            this.m = m;
        }
    }
}
