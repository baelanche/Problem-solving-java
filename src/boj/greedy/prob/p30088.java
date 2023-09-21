import java.util.*;
import java.io.*;

public class p30088 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        long a[] = new long[n];
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int sum = 0;
            for (int j=0; j<p; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            a[i] = sum;
        }
        
        Arrays.sort(a);
        for (int i=1; i<n; i++) {
            a[i] = a[i] + a[i-1];
        }
        
        System.out.println(Arrays.stream(a).sum());
    }
}
