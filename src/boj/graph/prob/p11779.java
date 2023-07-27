package boj.graph.prob;

import java.io.*;
import java.util.*;

public class p11779 {
    
    static List<Node> list[];
    static int dist[];
    static int prev[];
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        list = new ArrayList[n+1];
        for (int i=0; i<=n; i++) {
            list[i] = new ArrayList<>();
        }
        dist = new int[n+1];
        prev = new int[n+1];
        Arrays.fill(dist, 987654321);
        Arrays.fill(prev, -1);
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list[a].add(new Node(b, c));
        }
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        dist[s] = 0;
        
        System.out.println(dijkstra(s, e));
        int target = prev[e];
        sb.insert(0, e);
        int cnt = 1;
        while (true) {
            if (target == 987654321 || target == -1) break;
            sb.insert(0, target + " ");
            target = prev[target];
            cnt++;
        }
        System.out.println(cnt);
        System.out.println(sb.toString().trim());
        
    }
    
    public static int dijkstra(int s, int e) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(s, 0));
        
        while (!pq.isEmpty()) {
            Node curr = pq.poll();
            
            if (curr.w > dist[curr.v]) continue;
            
            for (int i=0; i<list[curr.v].size(); i++) {
                Node next = list[curr.v].get(i);
                if (dist[next.v] > curr.w + next.w) {
                    dist[next.v] = curr.w + next.w;
                    prev[next.v] = curr.v;
                    pq.offer(new Node(next.v, dist[next.v]));
                }
            }
        }
        
        return dist[e];
    }
    
    static class Node implements Comparable<Node> {
        int v;
        int w;
        Node (int v, int w) {
            this.v = v;
            this.w = w;
        }
        
        @Override
        public int compareTo(Node n) {
            return this.w - n.w;
        }
    }
}
