package boj.greedy.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1049 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int brand[][] = new int[m][2];
        
        int min = 100000000;
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            brand[i][0] = Integer.parseInt(st.nextToken());
            brand[i][1] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0; i<m; i++) {
            for(int j=i; j<m; j++) {
                int pkg = 6;
                while(pkg <= n) {
                    pkg += 6;
                }
                min = min(min, pkg / 6 * brand[i][0]);
                
                pkg -= 6;
                while(pkg > -1) {
                    int k = 0;
                    while(k + pkg < n) {
                        k++;
                    }
                    min = min(min, (pkg / 6 * brand[i][0]) + (k * brand[j][1]));
                    pkg -= 6;
                }
            }
        }
        
        bw.write(min + "\n");
        bw.flush();
    }
    
    public static int min(int a, int b) {
        return a > b ? b : a;
    }
}
