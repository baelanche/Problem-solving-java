package boj.dfs.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p1967 {

    public static ArrayList<Node>[] tree;
    public static boolean[] visited;
    public static int ans = 0;
    public static int longest;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        if (v == 1) {
            System.out.println(0);
            return;
        }
        tree = new ArrayList[v+1];
        for (int i=1; i<=v; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i=0; i<v-1; i++) {
            st = new StringTokenizer(br.readLine());
            int source = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            tree[source].add(new Node(target, dist));
            tree[target].add(new Node(source, dist));
        }

        visited = new boolean[v+1];
        dfs(1, 0);

        visited = new boolean[v+1];
        dfs(longest, 0);

        System.out.println(ans);
    }

    public static void dfs(int node, int len) {
        if (ans < len) {
            ans = len;
            longest = node;
        }

        visited[node] = true;

        for (int i=0; i<tree[node].size(); i++) {
            Node nowNode = tree[node].get(i);
            if (!visited[nowNode.n]) {
                dfs(nowNode.n, len + nowNode.dist);
            }
            visited[nowNode.n] = true;
        }
    }

    static class Node {
        int n;
        int dist;
        Node (int n, int dist) {
            this.n = n;
            this.dist = dist;
        }
    }
}
