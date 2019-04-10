package boj.dfs.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p11403 {

	static int n;
    static int a[][];
    static int path[][];
    static boolean visited[];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        a = new int[n+1][n+1];
        path = new int[n+1][n+1];
        visited = new boolean[n+1];
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        for(int i=1; i<=n; i++) {
            dfs(i);
            for(int j=1; j<=n; j++) {
                if(visited[j])
                    path[i][j] = 1;
            }
            Arrays.fill(visited, false);
        }
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
    public static void dfs(int x) {
        for(int i=1; i<=n; i++) {
            if(!visited[i] && a[x][i] == 1) {
                visited[i] = true;
                dfs(i);
            }
        }
    }
}
