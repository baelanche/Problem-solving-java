import java.io.*;
import java.util.*;

public class p14938 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        
        int dist[][] = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                dist[i][j] = i == j ? 0 : 987654321;
            }
        }
        int item[] = new int[n];
        int ans[] = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            item[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=0; i<r; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int l = Integer.parseInt(st.nextToken());
            dist[a][b] = l;
            dist[b][a] = l;
        }
        
        for (int k=0; k<n; k++) {
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                ans[i] += dist[i][j] <= m ? item[j] : 0;
            }
        }
        
        System.out.println(Arrays.stream(ans).max().getAsInt());
    }
}
