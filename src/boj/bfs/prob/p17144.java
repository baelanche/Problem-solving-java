package boj.bfs.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p17144 {

	static int r;
    static int c;
    static int t;
    static int a[][];
    static Pair cle1 = null;
    static Pair cle2 = null;
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        a = new int[r][c];
        
        for(int i=0; i<r; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<c; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
                if(a[i][j] == -1 && cle1 == null)
                    cle1 = new Pair(i, j, -1);
                else if(a[i][j] == -1 && cle1 != null)
                    cle2 = new Pair(i, j, -1);
            }
        }
        
        while(t-->0) {
            bfs();
        }
        
        int sum = 0;
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                if(a[i][j] != -1)
                    sum += a[i][j];
        
        System.out.println(sum);
    }
    
    public static void bfs() {
        Queue<Pair> q = new LinkedList<Pair>();
        
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                if(a[i][j] != 0 && a[i][j] != -1)
                    q.offer(new Pair(i, j, a[i][j]));
        
        int size = q.size();
        
        while(size-->0) {
            Pair p = q.poll();
            int cnt = 0;
            for(int i=0; i<4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if(0 <= nx && nx < r && 0 <= ny && ny < c) {
                    if(a[nx][ny] != -1) {
                        q.offer(new Pair(nx, ny, p.dust/5));
                        cnt++;
                    }
                }
            }
            q.offer(new Pair(p.x, p.y, p.dust - p.dust/5*cnt));
        }
        
        a = new int[r][c];
        a[cle1.x][cle1.y] = -1;
        a[cle2.x][cle2.y] = -1;
        
        while(!q.isEmpty()) {
            Pair p = q.poll();
            a[p.x][p.y] += p.dust;
        }
        
        nonclockWise(cle1.x, cle1.y);
        clockWise(cle2.x, cle2.y);
    }
    
    public static void nonclockWise(int x, int y) {
        int temp = 0;
        int last = 0;
        while(true) {
            if(y+1 >= c) break;
            temp = a[x][y+1];
            a[x][y+1] = last;
            last = temp;
            y++;
        }
        
        while(true) {
            if(x-1 < 0) break;
            temp = a[x-1][y];
            a[x-1][y] = last;
            last = temp;
            x--;
        }
        
        while(true) {
            if(y-1 < 0) break;
            temp = a[x][y-1];
            a[x][y-1] = last;
            last = temp;
            y--;
        }
        
        while(true) {
            if(x+1 >= r) break;
            temp = a[x+1][y];
            if(temp == -1) break;
            a[x+1][y] = last;
            last = temp;
            x++;
        }
    }
    
    public static void clockWise(int x, int y) {
        int temp = 0;
        int last = 0;
        while(true) {
            if(y+1 >= c) break;
            temp = a[x][y+1];
            a[x][y+1] = last;
            last = temp;
            y++;
        }
        
        while(true) {
            if(x+1 >= r) break;
            temp = a[x+1][y];
            a[x+1][y] = last;
            last = temp;
            x++;
        }
        
        while(true) {
            if(y-1 < 0) break;
            temp = a[x][y-1];
            a[x][y-1] = last;
            last = temp;
            y--;
        }
        
        while(true) {
            if(x-1 < 0) break;
            temp = a[x-1][y];
            if(temp == -1) break;
            a[x-1][y] = last;
            last = temp;
            x--;
        }
    }
    
    static class Pair {
        int x;
        int y;
        int dust;
        
        Pair(int x, int y, int dust) {
            this.x = x;
            this.y = y;
            this.dust = dust;
        }
    }
}
