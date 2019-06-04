package boj.greedy.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1080 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char a[][] = new char[n][m];
        boolean b[][] = new boolean[n][m];
        
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = st.nextToken().toCharArray();
        }
        
        boolean d = true;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            char temp[] = st.nextToken().toCharArray();
            for(int j=0; j<m; j++) {
                if(a[i][j] != temp[j]) {
                    b[i][j] = true;
                    d = false;
                }
                else b[i][j] = false;
            }
        }
        
        if(d) System.out.println(0);
        else {
            if(n < 3 || m < 3) System.out.println(-1);
            else {
                int cnt = 0;
                for(int i=0; i<=n-3; i++) {
                    for(int j=0; j<=m-3; j++) {
                        if(b[i][j]) {
                            change(b, i, j);
                            cnt++;
                        }
                    }
                }
                
                for(int i=0; i<n; i++) {
                    for(int j=0; j<m; j++) {
                        if(b[i][j]) {
                            System.out.println(-1);
                            return;
                        }
                    }
                }
                System.out.println(cnt);
            }
        }
    }
    
    public static void change(boolean b[][], int x, int y) {
        for(int i=x; i<x+3; i++) {
            for(int j=y; j<y+3; j++) {
                b[i][j] = !b[i][j];
            }
        }
    }
}
