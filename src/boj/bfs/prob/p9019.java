package boj.bfs.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p9019 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            sb.append(bfs(start, end)).append("\n");
        }
        System.out.print(sb.toString());
    }

    public static String bfs(int start, int end) {
        Queue<Pair> q = new LinkedList<>();
        boolean[] visited = new boolean[10000];
        q.add(new Pair(start, ""));
        visited[start] = true;

        while (!q.isEmpty()) {
            Pair p = q.poll();

            if (p.n == end) {
                return p.dslr;
            }

            int d = (p.n * 2) % 10000;
            if (!visited[d]) {
                q.add(new Pair(d, p.dslr + "D"));
                visited[d] = true;
            }

            int s = p.n == 0 ? 9999 : p.n - 1;
            if (!visited[s]) {
                q.add(new Pair(s, p.dslr + "S"));
                visited[s] = true;
            }

            int l = p.n % 1000 * 10 + p.n / 1000;
            if (!visited[l]) {
                q.add(new Pair(l, p.dslr + "L"));
                visited[l] = true;
            }

            int r = p.n % 10 * 1000 + p.n / 10;
            if (!visited[r]) {
                q.add(new Pair(r, p.dslr + "R"));
                visited[r] = true;
            }
        }

        return null;
    }

    static class Pair {
        int n;
        String dslr;

        Pair (int n, String dslr) {
            this.n = n;
            this.dslr = dslr;
        }
    }
}
