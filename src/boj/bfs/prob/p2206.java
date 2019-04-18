package boj.bfs.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p2206 {

	static int n;
    static int m;
    static int a[][];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n][m];
        
        for(int i=0; i<n; i++) {
            char c[] = sc.next().toCharArray();
            for(int j=0; j<m; j++) {
                a[i][j] = c[j] - 48;
            }
        }
        bfs(0, 0);
    }
    
    public static void bfs(int x, int y) {
        boolean visited[][][] = new boolean[2][n][m];
        Queue<Pair> queue = new LinkedList<Pair>();
        
        queue.offer(new Pair(x, y, 1));
        visited[0][x][y] = true;
        int result = 1;
        boolean fin = false;
        
        int mx[] = {1, 0, -1, 0};
        int my[] = {0, 1, 0, -1};
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            while(size-->0) {
                Pair point = queue.poll();
                int px = point.x;
                int py = point.y;
                int pc = point.crash;
                if(px == n-1 && py == m-1) fin = true;
                for(int i=0; i<4; i++) {
                    int nx = px + mx[i];
                    int ny = py + my[i];
                    if(0 <= nx && nx < n && 0 <= ny && ny < m) {
                        if(a[nx][ny] == 1) {
                            if(pc == 1 && !visited[0][nx][ny]) {
                                visited[0][nx][ny] = true;
                                queue.offer(new Pair(nx, ny, 0));
                            }
                        } else {
                            if(visited[pc][nx][ny]) continue;
                            visited[pc][nx][ny] = true;
                            queue.offer(new Pair(nx, ny, pc));
                        }
                    }
                }
            }
            if(fin) break;
            result++;
        }
        
        System.out.println(fin == true ? result : -1);
    }
    
    static class Pair {
        int x;
        int y;
        int crash;
        
        Pair(int x, int y, int crash) {
            this.x = x;
            this.y = y;
            this.crash = crash;
        }
    }
}
