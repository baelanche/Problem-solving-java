package boj.collection.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class p5430 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-->0) {
            char[] p = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> q = new ArrayDeque<>();
            boolean pos = true;
            String s = br.readLine();
            s = s.substring(1, s.length() - 1);
            String[] c = s.split(",");
            for (int i=0; i<n; i++) {
                q.addLast(Integer.parseInt(c[i]));
            }

            boolean empty = false;
            for (int i=0; i<p.length; i++) {
                if (p[i] == 'R') {
                    pos = !pos;
                }
                if (p[i] == 'D') {
                    if (q.isEmpty()) {
                        empty = true;
                        break;
                    }
                    if (pos) {
                        q.removeFirst();
                    } else {
                        q.removeLast();
                    }
                }
            }

            if (empty) {
                sb.append("error").append("\n");
                continue;
            }

            sb.append("[");
            if (pos) {
                while (!q.isEmpty()) {
                    sb.append(q.removeFirst());
                    if (q.size() > 0) {
                        sb.append(",");
                    }
                }
            } else {
                while (!q.isEmpty()) {
                    sb.append(q.removeLast());
                    if (q.size() > 0) {
                        sb.append(",");
                    }
                }
            }
            sb.append("]").append("\n");
        }
        System.out.print(sb.toString());
    }
}
