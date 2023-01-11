package boj.realize.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class p5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());
        char[] c = br.readLine().toCharArray();

        int ans = 0;
        int cnt = 0;
        for (int i=1; i<s-1; i++) {
            if (c[i-1] == 'I' && c[i] == 'O' && c[i+1] == 'I') {
                if (++cnt == n) {
                    ans++;
                    cnt--;
                }
                i++;
            } else {
                cnt = 0;
            }
        }
        System.out.println(ans);
    }
}
