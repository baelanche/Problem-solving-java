package boj.realize.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p15685 {

	static int a[][] = new int[101][101];
    static int direction[][] = new int[4][1024];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        direction[0][0] = 0;
        direction[1][0] = 1;
        direction[2][0] = 2;
        direction[3][0] = 3;
        
        for(int i=0; i<4; i++) {
            for(int j=1; j<=10; j++) {
                int s = (int)Math.pow(2, j-1);
                int e = (int)Math.pow(2, j);
                int z = 1;
                for(int k=s; k<e; k++) {
                    direction[i][k] = direction[i][k-z] + 1 == 4 ? 0 : direction[i][k-z] + 1;
                    z += 2;
                }
            }
        }
        
        int n = Integer.parseInt(br.readLine());
        while(n-->0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            
            dragonCurve(x, y, d, g);
        }
        
        int cnt = 0;
        for(int i=0; i<100; i++)
            for(int j=0; j<100; j++)
                if(a[i][j] == 1 && a[i][j+1] == 1 && a[i+1][j] == 1 && a[i+1][j+1] == 1)
                    cnt++;
        
        System.out.println(cnt);
    }
    
    public static void dragonCurve(int x, int y, int d, int g) {
        a[y][x] = 1;
        
        int len = (int)Math.pow(2, g);
        for(int i=0; i<len; i++) {
            switch(direction[d][i]) {
                case 0 :
                    a[y][++x] = 1;
                    break;
                case 1 :
                    a[--y][x] = 1;
                    break;
                case 2 :
                    a[y][--x] = 1;
                    break;
                case 3 :
                    a[++y][x] = 1;
                    break;
            }
        }
    }
}
