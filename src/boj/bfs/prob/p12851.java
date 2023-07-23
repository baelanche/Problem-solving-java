package boj.bfs.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p12851 {

    static int time = Integer.MAX_VALUE;
    static int ans = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        bfs(n, k);

        System.out.println(time);
        System.out.println(ans);
    }

    public static void bfs(int subin, int brother) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(subin, 0));
        boolean visited[] = new boolean[100001];

        while (!q.isEmpty()) {
            Node node = q.poll();
            visited[node.pos] = true;

            if (node.time > time) return;

            if (node.pos == brother) {
                if (node.time < time) {
                    time = node.time;
                    ans = 1;
                } else if (node.time == time) {
                    ans++;
                }
            }

            if (0 <= node.pos - 1 && node.pos - 1 <= 100000 && !visited[node.pos - 1]) {
                q.offer(new Node(node.pos - 1, node.time + 1));
            }

            if (0 <= node.pos + 1 && node.pos + 1 <= 100000 && !visited[node.pos + 1]) {
                q.offer(new Node(node.pos + 1, node.time + 1));
            }

            if (0 <= node.pos * 2 && node.pos * 2 <= 100000 && !visited[node.pos * 2]) {
                q.offer(new Node(node.pos * 2, node.time + 1));
            }
        }
    }

    static class Node {
        int pos;
        int time;
        Node (int pos, int time) {
            this.pos = pos;
            this.time = time;
        }
    }
}
