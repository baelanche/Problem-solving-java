package boj.backtrac.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p15651 {

	static int n;
    static int m;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        dfs(0, "");
    }
    
    public static void dfs(int len, String str) {
        if(len == m) {
            System.out.println(str);
            return;
        }
        
        for(int i=1; i<=n; i++)
            dfs(len + 1, str + i + " ");
    }
}
