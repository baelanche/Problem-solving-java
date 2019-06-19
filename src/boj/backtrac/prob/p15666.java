package boj.backtrac.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class p15666 {
	static int n;
    static int m;
    static ArrayList<Integer> a;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        Set<Integer> s = new TreeSet<Integer>();
        for(int i=0; i<n; i++) {
            int t = Integer.parseInt(st.nextToken());
            s.add(t);
        }
        
        a = new ArrayList<Integer>(s);
        
        dfs(0, 0, "");
    }
    
    public static void dfs(int idx, int len, String str) {
        if(len == m) {
            System.out.println(str);
            return;
        }
        
        for(int i=0; i<a.size(); i++)
            if(a.get(i) >= idx)
                dfs(a.get(i), len + 1, str + a.get(i) + " ");
    }
}
