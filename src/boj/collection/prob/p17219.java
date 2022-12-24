import java.io.*;
import java.util.*;

public class p17219 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, String> map = new HashMap<>();
        while (n-->0) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }
        
        while (m-->0) {
            st = new StringTokenizer(br.readLine());
            sb.append(map.get(st.nextToken())).append("\n");
        }
        System.out.println(sb.toString());
    }
}
