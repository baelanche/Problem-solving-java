import java.io.*;
import java.util.*;

public class p4195 {
    
    static int[] p;
    static int[] dep;
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(st.nextToken());
        for (int i=0; i<t; i++) {
            int f = Integer.parseInt(br.readLine());
            p = new int[200002];
            dep = new int[200002];
            for (int j=0; j<200002; j++) {
                p[j] = j;
            }
            Arrays.fill(dep, 1);
            
            int idx = 0;
            Map<String, Integer> map = new HashMap<>();
            for (int j=0; j<f; j++) {
                st = new StringTokenizer(br.readLine());
                String left = st.nextToken();
                String right = st.nextToken();
                if (!map.containsKey(left)) {
                    map.put(left, idx++);
                }
                if (!map.containsKey(right)) {
                    map.put(right, idx++);
                }
                
                sb.append(merge(map.get(left), map.get(right))).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
    
    public static int find(int n) {
        if (n == p[n]) {
            return n;
        }
        return p[n] = find(p[n]);
    }
    
    public static int merge(int a, int b) {
        a = find(a);
        b = find(b);
        
        if (a != b) {
            dep[a] += dep[b];
            p[b] = a;
            dep[b] = 1;
        }
        
        return dep[a];
    }
}
