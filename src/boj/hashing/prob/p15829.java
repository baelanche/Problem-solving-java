package boj.hashing.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15829 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        String text = br.readLine();
        int mod = 1234567891;

        long result = 0;
        long mul = 1;

        for (int i=0; i<l; i++) {
            result += (text.charAt(i) - 96) * mul;
            mul = (mul * 31) % mod;
        }

        System.out.println(result % mod);
    }
}
