package boj.divide.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10830 {

    static int n;
    static int a[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        a = new int[n][n];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                a[i][j] = Integer.parseInt(st.nextToken()) % 1000;
            }
        }

        int ret[][] = divide(a, b);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                sb.append(ret[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static int[][] divide(int l[][], long exp) {
        if (exp == 1) {
            return l;
        }

        int temp[][] = divide(l, exp/2);

        temp = mm(temp, temp);

        if (exp % 2 == 1) {
            temp = mm(temp, a);
        }
        return temp;
    }

    public static int[][] mm(int l[][], int r[][]) {
        int temp[][] = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                for (int k=0; k<n; k++) {
                        temp[i][j] += l[i][k] * r[k][j];
                        temp[i][j] %= 1000;
                }
            }
        }
        return temp;
    }
}
