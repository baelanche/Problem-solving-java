import java.io.*;
import java.util.*;

public class p11657 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean cycle = false;
        List<Pair> list[] = new ArrayList[n];
        for (int i=0; i<n; i++) {
            list[i] = new ArrayList<>();
        }
        long dist[] = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;
        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken());
            list[a].add(new Pair(b, c));
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                for (int k=0; k<list[j].size(); k++) {
                    Pair p = list[j].get(k);
                    int next = p.v;
                    int distance = p.w;
                    if (dist[j] != Long.MAX_VALUE && dist[next] > dist[j] + distance) {
                        dist[next] = dist[j] + distance;
                        if (i == n-1) cycle = true;
                    }
                }
            }
        }
        if (cycle) {
            System.out.println(-1);
        } else {
            for (int i=1; i<n; i++) {
                System.out.println(dist[i] != Long.MAX_VALUE ? dist[i] : -1);
            }
        }
    }
    
    static class Pair {
        int v;
        int w;
        Pair (int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
}
