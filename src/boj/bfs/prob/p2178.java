package boj.bfs.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p2178 {

	static int n;
    static int m;
    static int a[][] = new int[100][100];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            String str = sc.next();
            for(int j=0; j<str.length(); j++)
                a[i][j] = str.charAt(j) - 48;
        }
        bfs();
        sc.close();
    }
    
    public static void bfs() {
        boolean visited[][] = new boolean[100][100];
        int distance[][] = new int[100][100];
        Queue<Pair> q = new LinkedList<Pair>();
        int mx[] = {1, 0, -1, 0};
        int my[] = {0, 1, 0, -1};
        
        q.add(new Pair(0, 0));
        distance[0][0] = 1;
        while(!q.isEmpty()) {
            Pair point = q.poll();
            int px = point.getX();
            int py = point.getY();
            if(px == n-1 && py == m-1) break;
            for(int i=0; i<4; i++) {
                int nx = px + mx[i];
                int ny = py + my[i];
                if(0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if(a[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        q.offer(new Pair(nx, ny));
                        distance[nx][ny] = distance[px][py] + 1;
                    }
                }
            }
        }
        System.out.println(distance[n-1][m-1]);
    }
    
    static class Pair {
        int x;
        int y;
        
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        int getX() {
            return x;
        }
        
        int getY() {
            return y;
        }
    }
}
