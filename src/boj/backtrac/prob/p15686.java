package boj.backtrac.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import java.util.Stack;

public class p15686 {

	static int n;
    static int m;
    static ArrayList<Pair> h = new ArrayList<Pair>();
    static ArrayList<Pair> ch = new ArrayList<Pair>();
    static Stack<Pair> choice = new Stack<Pair>();
    static int ans = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        for(int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++) {
                int k = Integer.parseInt(st.nextToken());
                if(k == 1) h.add(new Pair(i, j));
                if(k == 2) ch.add(new Pair(i, j));
            }
        }
        
        setChicken(0, 0);
        System.out.println(ans);
    }
    
    public static void setChicken(int idx, int cnt) {
        if(cnt == m) {
            distance();
            return;
        }
        
        for(int i=idx; i<ch.size(); i++) {
            choice.push(ch.get(i));
            setChicken(i+1, cnt+1);
            choice.pop();
        }
    }
    
    public static void distance() {
        int sum = 0;
        for(int i=0; i<h.size(); i++) {
            int min = Integer.MAX_VALUE;
            for(int j=0; j<choice.size(); j++) {
                int diff = Math.abs(h.get(i).r - choice.get(j).r) + Math.abs(h.get(i).c - choice.get(j).c);
                min = Math.min(min, diff);
            }
            sum += min;
            if(sum > ans) return;
        }
        ans = Math.min(ans, sum);
    }
    
    static class Pair {
        int r;
        int c;
        
        Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
