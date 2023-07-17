import java.io.*;
import java.util.*;

public class p1238 {
    
    static int N;
    static List<Pair> list[];
    static int dist[];
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken()) - 1;
        
        list = new ArrayList[N];
        
        for (int i=0; i<N; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            int w = Integer.parseInt(st.nextToken());
            list[u].add(new Pair(v, w));
        }
        
        int max = Integer.MIN_VALUE;
        for (int i=0; i<N; i++) {
            max = Math.max(max, dijkstra(i, X) + dijkstra(X, i));
        }
        System.out.println(max);
    }
    
    public static int dijkstra(int s, int e) {
        dist = new int[N];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(s, 0));
        
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            
            if (curr.w > dist[curr.v]) continue;
            
            for (int i=0; i<list[curr.v].size(); i++) {
                Pair next = list[curr.v].get(i);
                if (dist[next.v] > curr.w + next.w) {
                    dist[next.v] = curr.w + next.w;
                    pq.offer(new Pair(next.v, dist[next.v]));
                }
            }
        }
        return dist[e];
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
