package boj.bfs.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p13549 {

    public static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        bfs(n, k);

        System.out.println(ans);
    }

    public static void bfs(int n, int k) {
        Queue<Node> q = new LinkedList<>();
        boolean[] visited = new boolean[100001];
        q.add(new Node(n, 0));
        visited[n] = true;

        while (!q.isEmpty()) {
            Node nowNode = q.poll();

            if (nowNode.pos == k) {
                ans = Math.min(ans, nowNode.cnt);
                continue;
            }

            int prev = nowNode.pos - 1;
            int blink = nowNode.pos * 2;
            int next = nowNode.pos + 1;
            if (0 <= prev && prev <= 100000 && !visited[prev]) {
                q.add(new Node(prev, nowNode.cnt + 1));
                visited[prev] = true;
            }
            if (0 <= blink && blink <= 100000 && !visited[blink]) {
                q.add(new Node(blink, nowNode.cnt));
                visited[blink] = true;
            }
            if (0 <= next && next <= 100000 && !visited[next]) {
                q.add(new Node(next, nowNode.cnt + 1));
                visited[next] = true;
            }
        }
    }

    static class Node {
        int pos;
        int cnt;

        Node (int pos, int cnt) {
            this.pos = pos;
            this.cnt = cnt;
        }
    }
}
