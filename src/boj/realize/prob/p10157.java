package boj.realize.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10157 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        
        int k = Integer.parseInt(br.readLine());
        
        int a[][] = new int[r][c];
        
        int left = 0;
        int right = 0;
        int top = 0;
        int bottom = 0;
        int seq = 0;
        while(true) {
            for(int i=r-1-bottom; i>=0+top; i--)
                a[i][left] = ++seq;
            left++;
            if(seq == r*c) break;
            
            for(int i=left; i<c-right; i++)
                a[top][i] = ++seq;
            top++;
            if(seq == r*c) break;
            
            for(int i=top; i<r-bottom; i++)
                a[i][c-1-right] = ++seq;
            right++;
            if(seq == r*c) break;
            
            for(int i=c-1-right; i>=0+left; i--)
                a[r-1-bottom][i] = ++seq;
            bottom++;
            if(seq == r*c) break;
        }
        
        if(r*c < k) System.out.println(0);
        else {
            for(int i=0; i<r; i++)
                for(int j=0; j<c; j++)
                    if(a[i][j] == k)
                        System.out.println((j+1) + " " + (r-i));
        }
    }
}
