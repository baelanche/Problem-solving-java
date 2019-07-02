package boj.dp.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1915 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int a[][] = new int[n+1][m+1];
        for(int i=1; i<=n; i++) {
            String s = br.readLine();
            for(int j=1; j<=m; j++)
                a[i][j] = s.charAt(j-1) - '0';
        }
        
        int max = 0;
        for(int i=1; i<=n; i++)
            for(int j=1; j<=m; j++)
                if(a[i][j] != 0) {
                    a[i][j] = min(a[i-1][j-1], a[i-1][j], a[i][j-1]) + 1;
                    max = Math.max(max, a[i][j]);
                }
        
        System.out.println(max*max);
    }
    
    public static int min(int a, int b, int c) {
        int min = a < b ? a : b;
        return min = min < c ? min : c;
    }
}
