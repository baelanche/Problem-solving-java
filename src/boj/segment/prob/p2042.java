import java.io.*;
import java.util.*;

public class p2042 {
    
    static long a[];
    static long tree[];
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        a = new long[n+1];
        tree = new long[n*4];
        for (int i=1; i<=n; i++) {
            a[i] = Long.parseLong(br.readLine());
        }
        
        construct(1, n, 1);
        
        for (int i=0; i<m+k; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            long r = Long.parseLong(st.nextToken());
            if (type == 1) {
                long val = r - a[l];
                a[l] = r;
                update(1, n, 1, l, val);
            } else {
                sb.append(sum(1, n, 1, l, (int)r)).append("\n");
            }
        }
        
        System.out.println(sb.toString());
    }
    
    public static long construct(int l, int r, int node) {
        if (l == r) {
            return tree[node] = a[l];
        }
        int mid = (l + r) / 2;
        return tree[node] = construct(l, mid, node*2) + construct(mid+1, r, node*2+1);
    }
    
    public static long sum(int curl, int curr, int node, int l, int r) {
        if (curr < l || r < curl) return 0;
        if (l <= curl && curr <= r) return tree[node];
        int mid = (curl + curr) / 2;
        return sum(curl, mid, node*2, l, r) + sum(mid+1, curr, node*2+1, l, r);
    }
    
    public static void update(int l, int r, int node, int idx, long val) {
        if (idx < l || idx > r) {
            return;
        }
        
        tree[node] += val;
        if (l == r) {
            return;
        }
        
        int mid = (l + r) / 2;
        update(l, mid, node*2, idx, val);
        update(mid+1, r, node*2+1, idx, val);
    }
}
