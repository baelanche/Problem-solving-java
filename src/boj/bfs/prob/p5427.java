package boj.bfs.prob;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p5427 {

	static int h;
    static int w;
    static char[][] a;
    static int[][] distance;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            h = sc.nextInt() + 2;
            w = sc.nextInt() + 2;
            a = new char[w][h];
            distance = new int[w][h];
            Arrays.fill(a[0], '0');
            Arrays.fill(a[w-1], '0');
            
            int x = 0, y = 0;
            for(int i=1; i<w-1; i++) {
                String str = "0" + sc.next() + "0";
                a[i] = str.toCharArray();
                for(int j=1; j<h-1; j++) {
                    if(a[i][j] == '@') {
                        x = i;
                        y = j;
                    }
                }
            }
            bfs(x, y);
        }
    }
    
    public static void bfs(int x, int y) {
        boolean[][] visited = new boolean[w][h];
        Queue<Pair> me = new LinkedList<Pair>();
        Queue<Pair> fire = new LinkedList<Pair>();
        
        int mx[] = {0, 1, 0, -1};
        int my[] = {1, 0, -1, 0};
        
        for(int i=0; i<w; i++) {
            for(int j=0; j<h; j++) {
                if(a[i][j] == '*') {
                    fire.offer(new Pair(i, j));
                }
            }
        }
        
        me.offer(new Pair(x, y));
        visited[x][y] = true;
        distance[x][y] = 0;
        boolean success = false;
        int result = 0;
        while(!me.isEmpty()) {
            if(success) break;
            int size = me.size();
            int fsize = fire.size();
            
            while(fsize-->0) {
                Pair fpoint = fire.poll();
                int fpx = fpoint.getX();
                int fpy = fpoint.getY();
                for(int i=0; i<4; i++) {
                    int fnx = fpx + mx[i];
                    int fny = fpy + my[i];
                    if(1 <= fnx && fnx < w-1 && 1 <= fny && fny < h-1) {
                        if(a[fnx][fny] == '.' || a[fnx][fny] == '@') {
                            a[fnx][fny] = '*';
                            fire.offer(new Pair(fnx, fny));
                        }
                    }
                }
            }
            while(size-->0) {
                Pair point = me.poll();
                int px = point.getX();
                int py = point.getY();
                if(a[px][py] == '0') {success = true; result = distance[px][py];}
                for(int i=0; i<4; i++) {
                    int nx = px + mx[i];
                    int ny = py + my[i];
                    if(0 <= nx && nx < w && 0 <= ny && ny < h) {
                        if((a[nx][ny] == '.' || a[nx][ny] == '0') && !visited[nx][ny]) {
                            visited[nx][ny] = true;
                            me.offer(new Pair(nx, ny));
                            distance[nx][ny] = distance[px][py] + 1;
                        }
                    }
                }
            }
        }
        
        System.out.println(success == true ? result : "IMPOSSIBLE");
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
