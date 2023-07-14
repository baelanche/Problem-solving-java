import java.util.*;
import java.io.*;

public class p18110 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(a);
        int exclude = (int)Math.round(n * 0.15);
        for (int i=0; i<exclude; i++) {
            a[i] = 0;
        }
        for (int i=n-1; i>n-1-exclude; i--) {
            a[i] = 0;
        }
        int sum = Arrays.stream(a).sum();
        int people = n - exclude * 2;
        System.out.println((int)Math.round((float)sum / people));
    }
}
