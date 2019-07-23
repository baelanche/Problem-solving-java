package boj.dfs.prob;

import java.util.Scanner;

public class p11580 {

	static int l;
    static char c[];
    static boolean visited[][] = new boolean[2001][2001];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        l = sc.nextInt();
        c = sc.next().toCharArray();
        
        dfs(1000, 1000, 0);
        
        int cnt = 0;
        for(int i=0; i<=2000; i++)
            for(int j=0; j<=2000; j++)
                if(visited[i][j])
                    cnt++;
        
        System.out.println(cnt);
    }
    
    public static void dfs(int x, int y, int seq) {
        visited[x][y] = true;
        
        if(seq == l) return;
        
        if(c[seq] == 'E') y++;
        if(c[seq] == 'W') y--;
        if(c[seq] == 'S') x--;
        if(c[seq] == 'N') x++;
        
        dfs(x, y, seq+1);
    }
}
