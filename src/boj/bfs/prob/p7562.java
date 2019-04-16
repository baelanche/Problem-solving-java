package boj.bfs.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p7562 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int mx[] = {-1, 1, 2, 2, 1, -1, -2, -2};
        int my[] = {2, 2, 1, -1, -2, -2, -1, 1};
        
        while(t-->0) {
            int l = sc.nextInt();
            boolean visited[][] = new boolean[l][l];
            int jump[][] = new int[l][l];
            Queue<Pair> q = new LinkedList<Pair>();
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            int gx = sc.nextInt();
            int gy = sc.nextInt();
            
            q.offer(new Pair(x, y));
            visited[x][y] = true;
            jump[x][y] = 0;
            while(!q.isEmpty()) {
                Pair point = q.poll();
                int px = point.getX();
                int py = point.getY();
                if(px == gx && py == gy) break;
                for(int i=0; i<8; i++) {
                    int nx = px + mx[i];
                    int ny = py + my[i];
                    if(0 <= nx && nx < l && 0 <= ny && ny < l) {
                        if(!visited[nx][ny]) {
                            visited[nx][ny] = true;
                            q.offer(new Pair(nx, ny));
                            jump[nx][ny] = jump[px][py] + 1;
                        }
                    }
                }
            }
            System.out.println(jump[gx][gy]);
        }
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
