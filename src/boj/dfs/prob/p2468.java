package boj.dfs.prob;

import java.util.Scanner;

public class p2468 {

	static int n;
    static int a[][];
    static int temp[][];
    static boolean visited[][];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        a = new int[n][n];
        visited = new boolean[n][n];
        
        int top = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
                if(top < a[i][j])
                    top = a[i][j];
            }
        }
        temp = a;
        
        int max = 0;
        for(int i=0; i<top; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    visited[j][k] = false;
                }
            }
            dfs(0, 0, i);
            
            
            System.out.println("height : " + i);
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    System.out.print(temp[j][k] + " ");
                }
                System.out.println();
            }
            
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    visited[j][k] = false;
                }
            }
            
            int cnt = 0;
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    if(!visited[j][k] && temp[j][k] != 0) {
                        dfs(j, k);
                        cnt++;
                    }
                }
            }
            if(max < cnt)
                max = cnt;
            System.out.println("높이가 " + i + "일때 컴포넌트의 개수 : " + cnt);
        }
        //System.out.println(max);
        sc.close();
    }
    
    public static void dfs(int x, int y) {
        if(temp[x][y] == 0)
            return;
        
        visited[x][y] = true;
        
        int mx[] = {1, 0, -1, 0};
        int my[] = {0, 1, 0, -1};
        
        for(int i=0; i<4; i++) {
            int nx = x + mx[i];
            int ny = y + my[i];
            
            if(0 <= nx && nx < n && 0 <= ny && ny < n) {
                if(!visited[nx][ny])
                    dfs(nx, ny);
            }
        }
    }
    
    public static void dfs(int x, int y, int height) {
        visited[x][y] = true;
        
        if(a[x][y] <= height)
            temp[x][y] = 0;
        
        int mx[] = {1, 0, -1, 0};
        int my[] = {0, 1, 0, -1};
        
        for(int i=0; i<4; i++) {
            int nx = x + mx[i];
            int ny = y + my[i];
            
            if(0 <= nx && nx < n && 0 <= ny && ny < n) {
                if(!visited[nx][ny])
                    dfs(nx, ny, height);
            }
        }
    }
}
