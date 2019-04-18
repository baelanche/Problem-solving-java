package boj.bfs.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p3055 {

	static int r;
    static int c;
    static char a[][];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        r = sc.nextInt();
        c = sc.nextInt();
        
        a = new char[r][c];
        for(int i=0; i<r; i++)
            a[i] = sc.next().toCharArray();
        
        bfs();
    }
    
    public static void bfs() {
        boolean visited[][] = new boolean[r][c];
        int distance[][] = new int[r][c];
        Queue<Pair> go = new LinkedList<Pair>();
        Queue<Pair> water = new LinkedList<Pair>();
        
        int result = 0;
        int gx = 0, gy = 0;
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(a[i][j] == 'S') {
                    go.offer(new Pair(i, j));
                    visited[i][j] = true;
                    distance[i][j] = 0;
                }
                if(a[i][j] == '*')
                    water.offer(new Pair(i, j));
                if(a[i][j] == 'D') {
                    gx = i; gy = j;
                }
            }
        }
        
        int mx[] = {0, 1, 0, -1};
        int my[] = {1, 0, -1, 0};
        
        while(!go.isEmpty()) {
            int watersize = water.size();
            int gosize = go.size();
            
            while(watersize-->0) {
                Pair point = water.poll();
                int px = point.x;
                int py = point.y;
                for(int i=0; i<4; i++) {
                    int nx = px + mx[i];
                    int ny = py + my[i];
                    if(0 <= nx && nx < r && 0 <= ny && ny < c) {
                        if(a[nx][ny] == '.' || a[nx][ny] == 'S') {
                            water.offer(new Pair(nx, ny));
                            a[nx][ny] = '*';
                        }
                    }
                }
            }
            
            while(gosize-->0) {
                Pair point = go.poll();
                int px = point.x;
                int py = point.y;
                if(px == gx && py == gy) result = distance[gx][gy];
                for(int i=0; i<4; i++) {
                    int nx = px + mx[i];
                    int ny = py + my[i];
                    if(0 <= nx && nx < r && 0 <= ny && ny < c) {
                        if((a[nx][ny] == '.' || a[nx][ny] == 'D') && !visited[nx][ny]) {
                            visited[nx][ny] = true;
                            go.offer(new Pair(nx, ny));
                            distance[nx][ny] = distance[px][py] + 1;
                        }
                    }
                }
            }
        }
        System.out.println(result == 0 ? "KAKTUS" : result);
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
