import java.io.*;
import java.util.*;

public class p1916 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int M = Integer.parseInt(st.nextToken());
        
        List<Pair> list[] = new ArrayList[N];
        int dist[] = new int[N];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
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
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken()) - 1;
        int e = Integer.parseInt(st.nextToken()) - 1;
        
        dist[s] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(s, 0));
        
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
        
        System.out.println(dist[e]);
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
