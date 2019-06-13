package boj.backtrac.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p10597 {

	static String s;
    static boolean used[] = new boolean[51];
    static int a[] = new int[50];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        s = br.readLine();
        dfs(0, 0);
    }
    
    public static void dfs(int idx, int fill) {
        if(idx >= s.length()) {
            int e = 50;
            for(int i=1; i<=50; i++) {
                if(!used[i]) {
                    e = i-1;
                    break;
                }
            }
            int cnt = 0;
            for(int i=0; i<50; i++)
                if(a[i] != 0)
                    cnt++;
            
            if(e != cnt) return;
            print();
            System.exit(0);
        }
        
        int n = Integer.parseInt(s.substring(idx, idx+1));
        
        if(!used[n]) {
            used[n] = true;
            a[fill] = n;
            dfs(idx + 1, fill + 1);
            used[n] = false;
            a[fill] = 0;
        }
        
        if(idx + 1 < s.length()) {
        	int k = Integer.parseInt(s.substring(idx, idx+2));
        
	        if(k <= 50 && !used[k]) {
	            used[k] = true;
	            a[fill] = k;
	            dfs(idx + 2, fill + 1);
	            used[k] = false;
	            a[fill] = 0;
	        }
        }
    }
    
    public static void print() {
        for(int i=0; i<50; i++)
            if(a[i] != 0)
                System.out.print(a[i] + " ");
    }
}
