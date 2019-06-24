package boj.realize.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p14891 {

	static int a[][] = new int[5][9];
    static boolean visited[] = new boolean[5];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        for(int i=1; i<=4; i++) {
            String s = br.readLine();
            for(int j=1; j<=8; j++)
                a[i][j] = s.charAt(j-1) - '0';
        }
        
        int k = Integer.parseInt(br.readLine());
        while(k-->0) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            
            visited[idx] = true;
            rotate(idx, d);
            
            Arrays.fill(visited, false);
        }
        
        int score = 0;
        for(int i=1; i<=4; i++)
            if(a[i][1] == 1)
                score += Math.pow(2, i-1);
        
        System.out.println(score);
    }
    
    public static void rotate(int idx, int d) {
        if(idx - 1 > 0 && !visited[idx-1])
            if(a[idx-1][3] != a[idx][7]) {
                visited[idx-1] = true;
                rotate(idx-1, -d);
            }
        
        if(idx + 1 < 5 && !visited[idx+1])
            if(a[idx][3] != a[idx+1][7]) {
                visited[idx+1] = true;
                rotate(idx+1, -d);
            }
        
        int prev = a[idx][1];
        int curr = 0;
        if(d == 1) {
            for(int i=2; i<=8; i++) {
                curr = a[idx][i];
                a[idx][i] = prev;
                prev = curr;
            }
        } else {
            for(int i=8; i>=2; i--) {
                curr = a[idx][i];
                a[idx][i] = prev;
                prev = curr;
            }
        }
        a[idx][1] = curr;
    }
}
