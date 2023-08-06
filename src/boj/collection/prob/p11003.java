package boj.collection.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class p11003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int a[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        PriorityQueue<Node> pq = new PriorityQueue<>();

        int cnt = 0;
        while (cnt < n) {
            cnt++;
        }
    }

    static class Node implements Comparable<Node> {
        int num;
        int idx;
        Node (int num, int idx) {
            this.num = num;
            this.idx = idx;
        }

        @Override
        public int compareTo(Node n) {
            return this.num - n.num;
        }
    }
}
