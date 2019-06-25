package boj.backtrac.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p17142 {

	static int n;
    static int m;
    static int a[][];
    static ArrayList<Pair> virus = new ArrayList<Pair>();
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n][n];
        
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
                if(a[i][j] == 2) virus.add(new Pair(i, j));
            }
        }
        
        setVirus(0, 0);
        
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
    
    public static void setVirus(int idx, int cnt) {
        if(cnt == m) {
            bfs();
            return;
        }
        
        if(idx == virus.size()) return;
        
        for(int i=idx; i<virus.size(); i++) {
            Pair p = virus.get(i);
            a[p.x][p.y] = 3;
            setVirus(i+1, cnt+1);
            a[p.x][p.y] = 2;
        }
    }
    
    /* 0 : 빈칸
     * 1 : 벽
     * 2 : 비활성 바이러스
     * 3 : 활성 바이러스
     */
    public static void bfs() {
        Queue<Pair> q = new LinkedList<Pair>();
        int temp[][] = new int[n][n];
        boolean visited[][] = new boolean[n][n];
        int empty = 0;
        
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++) {
                temp[i][j] = a[i][j];
                if(temp[i][j] == 3) {
                    q.offer(new Pair(i, j));
                    visited[i][j] = true;
                }
                if(temp[i][j] == 0) empty++;
            }
        
        int t = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            
            if(min <= t) return; //가지치기
            if(empty == 0) break;
            
            while(size-->0) {
                Pair p = q.poll();
                for(int i=0; i<4; i++) {
                    int nx = p.x + dx[i];
                    int ny = p.y + dy[i];
                    if(0 <= nx && nx < n && 0 <= ny && ny < n) {
                        if(!visited[nx][ny] && temp[nx][ny] != 1) {
                            if(temp[nx][ny] == 0) empty--;
                            visited[nx][ny] = true;
                            temp[nx][ny] = 3;
                            q.offer(new Pair(nx, ny));
                        }
                    }
                }
            }
            t++;
        }
        
        if(empty == 0) min = Math.min(min, t);
    }
    
    static class Pair {
        int x;
        int y;
        
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
