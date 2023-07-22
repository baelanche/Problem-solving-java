package boj.graph.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1956 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int INF = 1000000000;
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int dist[][] = new int[V][V];
        for (int i=0; i<V; i++) {
            Arrays.fill(dist[i], INF);
        }
        for (int i=0; i<E; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int c = Integer.parseInt(st.nextToken());
            dist[a][b] = c;
        }

        for (int k=0; k<V; k++) {
            for (int i=0; i<V; i++) {
                for (int j=0; j<V; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i=0, j=0; i<V; i++, j++) {
            ans = Math.min(ans, dist[i][j]);
        }
        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }
}
