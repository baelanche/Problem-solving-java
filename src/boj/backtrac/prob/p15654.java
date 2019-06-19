package boj.backtrac.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p15654 {

	static int n;
    static int m;
    static int a[];
    static boolean visited[];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[10001];
        a = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(a);
        dfs(0, "");
    }
    
    public static void dfs(int len, String str) {
        if(len == m) {
            System.out.println(str);
            return;
        }
        
        for(int i=0; i<n; i++) {
            if(!visited[a[i]]) {
                visited[a[i]] = true;
                dfs(len + 1, str + a[i] + " ");
                visited[a[i]] = false;
            }
        }
    }
}
