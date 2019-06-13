package boj.backtrac.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2661 {

static int n;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        dfs(1, "1");
    }
    
    public static void dfs(int idx, String s) {
        if(n == idx) {
            System.out.println(s);
            System.exit(0);
        }
        
        for(int i=1; i<=3; i++)
            if(goodSeq(s + i))
                dfs(idx+1, s+i);
    }
    
    public static boolean goodSeq(String str) {
        int s = str.length()-1;
        int e = str.length();
        
        for(int i=1; i<=str.length()/2; i++) {
            if(str.substring(s-i, e-i).equals(str.substring(s, e)))
                return false;
            s--;
        }
        return true;
    }
}
