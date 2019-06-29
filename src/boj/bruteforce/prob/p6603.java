package boj.bruteforce.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p6603 {

	static int a[];
    static int k;
    static boolean f = true;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        while(true) {
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if(k == 0) break;
            a = new int[k];
            for(int i=0; i<k; i++)
                a[i] = Integer.parseInt(st.nextToken());
            
            if(!f) System.out.println();
            dfs(0, 0, "");
        }
    }
    
    public static void dfs(int idx, int cnt, String s) {
        if(cnt == 6) {
            f = false;
            System.out.println(s);
            return;
        }
        
        for(int i=idx; i<k; i++)
            dfs(i+1, cnt+1, s+a[i]+" ");
    }
}
