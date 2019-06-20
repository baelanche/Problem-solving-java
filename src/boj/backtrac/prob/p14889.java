package boj.backtrac.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p14889 {

	static int n;
    static int a[][];
    static boolean visited[];
    static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());
        a = new int[n][n];
        visited = new boolean[n];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++)
                a[i][j] = Integer.parseInt(st.nextToken());
        }
        
        dfs(0, 0);
        
        System.out.println(min);
    }
    
    public static void dfs(int idx, int len) {
        if(len == n/2) {
            int startTeam[] = new int[n/2 + 1];
            int linkTeam[] = new int[n/2 + 1];
            int s = 0;
            int l = 0;
            for(int i=0; i<n; i++) {
                if(visited[i])
                    startTeam[s++] = i;
                else
                    linkTeam[l++] = i;
            }
            
            int start = 0;
            int link = 0;
            for(int i=0; i<n/2; i++) {
                for(int j=i+1; j<n/2; j++) {
                    start += a[startTeam[i]][startTeam[j]] + a[startTeam[j]][startTeam[i]];
                    link += a[linkTeam[i]][linkTeam[j]] + a[linkTeam[j]][linkTeam[i]];
                }
            }
            
            min = Math.min(min, Math.abs(start - link));
            return;
        }
        
        for(int i=idx; i<n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(i, len+1);
                visited[i] = false;
            }
        }
    }
}
