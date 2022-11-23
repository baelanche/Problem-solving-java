package boj.realize.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p18111 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int a[][] = new int[n][m];
        int resultTime = Integer.MAX_VALUE;
        int resultDepth = -1;
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int depth = 256; depth>=0; depth--) {
            int block = b;
            int time = 0;

            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    if (a[i][j] < depth) {
                        time += depth - a[i][j];
                        block -= depth - a[i][j];
                    } else if (a[i][j] > depth) {
                        time += (a[i][j] - depth) * 2;
                        block += a[i][j] - depth;
                    }
                }
            }

            if (0 <= block && time < resultTime) {
                resultTime = time;
                resultDepth = depth;
            }
        }

        System.out.println(resultTime + " " + resultDepth);
    }
}
