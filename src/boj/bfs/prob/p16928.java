package boj.bfs.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p16928 {

    public static int[] a = new int[101];
    public static boolean[] visited = new boolean[101];
    public static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            a[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }
        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            a[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }

        bfs();
        System.out.println(answer);
    }

    public static void bfs() {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(1, 0));
        visited[1] = true;

        while (!q.isEmpty()) {
            Pair current = q.poll();
            for (int i=1; i<=6; i++) {
                int nPos = current.pos + i;
                if (nPos == 100) {
                    answer = Math.min(answer, current.cnt + 1);
                    continue;
                }
                if (nPos < 101 && !visited[nPos]) {
                    if (a[nPos] != 0) {
                        visited[nPos] = true;
                        nPos = a[nPos];
                    }
                    q.add(new Pair(nPos, current.cnt + 1));
                    visited[nPos] = true;
                }
            }
        }
    }

    static class Pair {
        int pos;
        int cnt;

        Pair (int pos, int cnt) {
            this.pos = pos;
            this.cnt = cnt;
        }
    }
}