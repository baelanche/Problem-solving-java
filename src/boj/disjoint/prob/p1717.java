package boj.disjoint.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1717 {
	    
    int tree[];
    int size;
    
    p1717(int size) {
        tree = new int[size+1];
        this.size = size;
        
        Arrays.fill(tree, -1);
    }
    
    void set(int root, int child) {
        tree[child] = root;
    }
    
    int find(int n) {
        if(tree[n] < 0) return n;
        tree[n] = find(tree[n]);
        return tree[n];
    }
    
    void union(int a, int b) {
        a = find(a);
        b = find(b);
        if(a == b) return;
        tree[a] += tree[b];
        tree[b] = a;
    }
	    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        p1717 uf = new p1717(n);
        while(m-->0) {
            st = new StringTokenizer(br.readLine());
            int status = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(status == 0)
                uf.union(a, b);
            else
                System.out.println(uf.find(a) == uf.find(b) ? "YES" : "NO");
        }
    }
}
