package boj.bfs.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1167 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int[][] a = new int[v+1][v+1];

        for (int i=0; i<v; i++) {
            st = new StringTokenizer(br.readLine());
            int source = Integer.parseInt(st.nextToken());
            while (true) {
                int target = Integer.parseInt(st.nextToken());
                if (target == -1) {
                    break;
                }
                a[source][target] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<v+1; i++) {
            for (int j=0; j<v+1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
