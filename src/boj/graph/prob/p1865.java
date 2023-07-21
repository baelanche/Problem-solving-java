import java.io.*;
import java.util.*;

public class p1865 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(st.nextToken());
        while (tc-->0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            
            boolean cycle = false;
            List<Pair> list[] = new ArrayList[N];
            for (int i=0; i<N; i++) {
                list[i] = new ArrayList<>();
            }
            int dist[] = new int[N];
            Arrays.fill(dist, 123456789);
            dist[0] = 0;
            for (int i=0; i<M; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken()) - 1;
                int v = Integer.parseInt(st.nextToken()) - 1;
                int w = Integer.parseInt(st.nextToken());
                list[u].add(new Pair(v, w));
                list[v].add(new Pair(u, w));
            }
            for (int i=0; i<W; i++) {
                st = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(st.nextToken()) - 1;
                int v = Integer.parseInt(st.nextToken()) - 1;
                int w = Integer.parseInt(st.nextToken());
                list[u].add(new Pair(v, -w));
            }
            
            for (int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    for (int k=0; k<list[j].size(); k++) {
                        Pair p = list[j].get(k);
                        int next = p.v;
                        int distance = p.w;
                        if (dist[j] != 123456789 && dist[next] > dist[j] + distance) {
                            dist[next] = dist[j] + distance;
                            if (i == N-1) cycle = true;
                        }
                    }
                }
            }
            
            if (cycle) {
                sb.append("YES");
            } else {
                sb.append("NO");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
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
