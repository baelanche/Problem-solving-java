import java.io.*;
import java.util.*;

public class p1753 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine()) - 1;
        List<Pair> list[] = new ArrayList[V];
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[K] = 0;
        
        for (int i=0; i<V; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i=0; i<E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            int w = Integer.parseInt(st.nextToken());
            list[u].add(new Pair(v, w));
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(K, 0));
        
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            
            for (int i=0; i<list[curr.v].size(); i++) {
                Pair next = list[curr.v].get(i);
                if (dist[next.v] > curr.w + next.w) {
                    dist[next.v] = curr.w + next.w;
                    pq.offer(new Pair(next.v, dist[next.v]));
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<V; i++) {
            if (dist[i] != Integer.MAX_VALUE) {
                sb.append(dist[i]).append("\n");
            } else {
                sb.append("INF").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
    
    static class Pair implements Comparable<Pair> {
        int v;
        int w;
        Pair (int v, int w) {
            this.v = v;
            this.w = w;
        }
        
        @Override
        public int compareTo(Pair n){
            return this.w - n.w;
        }
    }
}
