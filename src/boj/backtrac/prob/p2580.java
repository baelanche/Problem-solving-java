package boj.backtrac.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2580 {

static int a[][] = new int[9][9];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++)
                a[i][j] = Integer.parseInt(st.nextToken());
        }
        dfs(0);
    }
    
    public static void dfs(int cnt) {
        if(cnt == 81) {
            for(int i=0; i<9; i++) {
                for(int j=0; j<9; j++)
                    System.out.print(a[i][j] + " ");
                System.out.println();
            }
            System.exit(0);
        }
        
        int r = cnt/9;
        int c = cnt%9;
        if(a[r][c] != 0)
            dfs(cnt+1);
        else {
        for(int i=1; i<=9; i++) {
            if(inputNumber(r, c, i)) {
                a[r][c] = i;
                dfs(cnt+1);
                a[r][c] = 0;
            }
        }
        }
    }
    
    public static boolean inputNumber(int r, int c, int num) {
        for(int i=0; i<9; i++) {
            if(a[i][c] == num) return false;
            if(a[r][i] == num) return false;
        }
        int x = r/3*3;
        int y = c/3*3;
        
        for(int i=x; i<x+3; i++)
            for(int j=y; j<y+3; y++)
                if(a[i][j] == num) return false;
        
        return true;
    }
}
