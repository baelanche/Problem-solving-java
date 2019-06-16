package boj.backtrac.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1405 {

	static boolean visited[][] = new boolean[29][29];
    static double a[] = new double[4];
    static int dr[] = {-1, 1, 0, 0};
    static int dc[] = {0, 0, -1, 1};
    static double result = 0;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        for(int i=0; i<4; i++)
            a[i] = Double.parseDouble(st.nextToken()) / 100;
        
        dfs(14, 14, n, 1);
        System.out.println(String.format("%.9f", result));
    }
    
    public static void dfs(int r, int c, int move, double d) {
        if(move == 0) {
            result += d;
            return;
        }
        
        visited[r][c] = true;
        for(int i=0; i<4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(!visited[nr][nc])
                dfs(nr, nc, move-1, d*a[i]);
        }
        visited[r][c] = false;
    }
}
