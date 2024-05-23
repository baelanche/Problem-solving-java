package boj.collection.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p5179 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int q = 1; q<=T; q++){
            st = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());

            int a[][] = new int[P+1][M];
            int b[][] = new int[P+1][M];
            for (int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                int p = Integer.parseInt(st.nextToken());
                char m = st.nextToken().charAt(0);
                int t = Integer.parseInt(st.nextToken());
                int j = Integer.parseInt(st.nextToken());

                if (j == 0) {
                    b[p][m - 'A']++;
                } else {
                    if (a[p][m - 'A'] == 0) {
                        a[p][m - 'A'] = t + b[p][m - 'A'] * 20;
                    }
                }
            }

            Result[] results = new Result[P+1];
            if (q > 1) {
                sb.append("\n");
            }
            sb.append("Data Set " + q + ":").append("\n");
            for (int i=0; i<P+1; i++) {
                int ans = 0;
                int sum = 0;
                for (int j=0; j<M; j++) {
                    if (a[i][j] != 0) {
                        ans++;
                        sum += a[i][j];
                    }
                }
                results[i] = new Result(i+1, ans, sum);
            }

            Arrays.sort(results, Comparator
                    .comparingInt((Result r) -> r.ans)
                    .reversed()
                    .thenComparingInt((Result r) -> r.sum));

            for (int i=0; i<P+1; i++) {
                if (results[i].ans != 0) {
                    sb.append(results[i].id - 1 + " " + results[i].ans + " " + results[i].sum).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }

    static class Result {
        int id;
        int ans;
        int sum;

        public Result(int id, int ans, int sum) {
            this.id = id;
            this.ans = ans;
            this.sum = sum;
        }
    }
}
