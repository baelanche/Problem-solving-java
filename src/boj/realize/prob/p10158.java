package boj.realize.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10158 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        int t = Integer.parseInt(br.readLine());
        
        int xMove = t % (w*2);
        int yMove = t % (h*2);
        
        boolean right = true;
        while(xMove-->0) {
            if(p == 0) right = true;
            if(p == w) right = false;
            
            if(right) p++;
            else p--;
        }
        
        boolean up = true;
        while(yMove-->0) {
            if(q == 0) up = true;
            if(q == h) up = false;
            
            if(up) q++;
            else q--;
        }
        
        System.out.println(p + " " + q);
    }
}
