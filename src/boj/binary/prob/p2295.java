package boj.binary.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2295 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(a);

        for (int i=n-1; i>=0; i--) {
            int z = a[i];
            for (int j=n-1; j>=0; j--) {
                for (int k=n-1; k>=0; k--) {
                    if (a[j] + a[k] > z) {
                        continue;
                    }
                    for (int l=n-1; l>=0; l--) {
                        if (a[j] + a[k] + a[l] > z) {
                            continue;
                        }

                        if (a[j] + a[k] + a[l] == z) {
                            System.out.println(z);
                            return;
                        }
                    }
                }
            }
        }
    }
}
