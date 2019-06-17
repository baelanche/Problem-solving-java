package boj.disjoint.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1976 {

static int a[];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        a = new int[n];
        Arrays.fill(a, -1);
        
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                int c = Integer.parseInt(st.nextToken());
                if(c == 1) union(i, j);
            }
        }
        
        st = new StringTokenizer(br.readLine());
        int result = find(Integer.parseInt(st.nextToken()) - 1);
        for(int i=0; i<m-1; i++) {
            if(find(Integer.parseInt(st.nextToken()) - 1) != result) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    
    public static int find(int n) {
        if(a[n] < 0) return n;
        a[n] = find(a[n]);
        return a[n];
    }
    
    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if(x == y) return;
        a[x] += a[y];
        a[y] = x;
    }
}
