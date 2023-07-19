import java.util.*;
import java.io.*;

public class p20529 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        while(t-->0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s[] = new String[n];
            for (int i=0; i<n; i++) {
                s[i] = st.nextToken();
            }
            
            int min = Integer.MAX_VALUE;
            for (int i=0; i<n; i++) {
                for (int j=i+1; j<n; j++) {
                    for (int k=j+1; k<n; k++) {
                        int sum = 0;
                        sum += getDist(s[i], s[j]);
                        sum += getDist(s[i], s[k]);
                        sum += getDist(s[j], s[k]);
                        min = Math.min(min, sum);
                        if (min == 0) break;
                    }
                    if (min == 0) break;
                }
                if (min == 0) break;
            }
            System.out.println(min);
        }
        
    }
    
    public static int getDist(String a, String b) {
        int dist = 0;
        for (int i=0; i<4; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                dist++;
            }
        }
        return dist;
    }
    
}
