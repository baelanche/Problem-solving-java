package boj.bfs.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p7576 {

	static int m;
    static int n;
    static int a[][];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        m = sc.nextInt();
        n = sc.nextInt();
        a = new int[n][m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        bfs();
    }
    
    public static void bfs() {
        Queue<Pair> tomato = new LinkedList<Pair>();
        boolean visited[][] = new boolean[n][m];
        int result = 0;
        boolean success = false;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(a[i][j] == 1) {
                    tomato.offer(new Pair(i ,j));
                    visited[i][j] = true;
                }
            }
        }
        
        int mx[] = {0, 1, 0, -1};
        int my[] = {1, 0, -1, 0};
        while(!tomato.isEmpty()) {
            int size = tomato.size();
            
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    if(a[i][j] == 0) {
                        success = false;
                        break;
                    } else success = true;
                }
                if(!success) break;
            }
            if(success) break;
            
            while(size-->0) {
                Pair point = tomato.poll();
                for(int i=0; i<4; i++) {
                    int nx = point.x + mx[i];
                    int ny = point.y + my[i];
                    if(0 <= nx && nx < n && 0 <= ny && ny < m) {
                        if(a[nx][ny] == 0 && !visited[nx][ny]) {
                            visited[nx][ny] = true;
                            a[nx][ny] = 1;
                            tomato.offer(new Pair(nx, ny));
                        }
                    }
                }
            }
            result++;
        }
        System.out.println(success == true ? result : -1);
    }
    static class Pair {
        int x;
        int y;
        
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
