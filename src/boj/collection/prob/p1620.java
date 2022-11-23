package boj.collection.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class p1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> dic = new HashMap<>();
        for (int i=1; i<=n; i++) {
            String pocketmon = br.readLine();
            dic.put(String.valueOf(i), pocketmon);
            dic.put(pocketmon, String.valueOf(i));
        }

        for (int i=0; i<m; i++) {
            String input = br.readLine();
            sb.append(dic.get(input)).append("\n");
        }

        System.out.println(sb.toString());
    }
}
