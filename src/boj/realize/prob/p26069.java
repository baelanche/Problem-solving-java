package boj.realize.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p26069 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            if (a.equals("ChongChong")) {
                set.add(b);
            } else if (b.equals("ChongChong")) {
                set.add(a);
            }

            if (set.contains(a)) {
                set.add(b);
            } else if (set.contains(b)) {
                set.add(a);
            }
        }
        System.out.println(set.size());
    }
}
