package boj.dfs.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p13901 {

	static int r;
    static int c;
    static int a[][];
    static int d[] = new int[4];
    static int lx;
    static int ly;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        a = new int[r][c];
        
        int k = Integer.parseInt(br.readLine());
        while(k-->0) {
            st = new StringTokenizer(br.readLine());
            int bx = Integer.parseInt(st.nextToken());
            int by = Integer.parseInt(st.nextToken());
            a[bx][by] = 2;
        }
        
        st = new StringTokenizer(br.readLine());
        lx = Integer.parseInt(st.nextToken());
        ly = Integer.parseInt(st.nextToken());
        a[lx][ly] = 1;
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++)
            d[i] = Integer.parseInt(st.nextToken());
        
        dfs(0, 0);
        System.out.println(lx + " " + ly);
    }
    
    public static void dfs(int idx, int cnt) {
        if(cnt == 4) {
            return;
        }
        int x = lx;
        int y = ly;
        if(d[idx] == 1) x -= 1;
        if(d[idx] == 2) x += 1;
        if(d[idx] == 3) y -= 1;
        if(d[idx] == 4) y += 1;
        
        if(0 <= x && x < r && 0 <= y && y < c) {
            if(a[x][y] == 0) {
                lx = x;
                ly = y;
                a[x][y] = 1;
                dfs(idx, 0);
                return;
            }
        }
        
        idx = idx + 1 == 4 ? 0 : idx + 1;
        dfs(idx, cnt+1);
    }
}
