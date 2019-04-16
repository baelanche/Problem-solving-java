package boj.bfs.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p2644 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[][] = new int[101][101];
        boolean visited[] = new boolean[101];
        Queue<Integer> q = new LinkedList<Integer>();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int m = sc.nextInt();
        while(m-->0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x][y] = 1;
            arr[y][x] = 1;
        }
        
        q.offer(a);
        visited[a] = true;
        int level = 0;
        boolean eq = false;
        while(!q.isEmpty()) {
            int size = q.size();
            if(eq) break;
            for(int x=0; x<size; x++) {
                int curr = q.peek();
                q.poll();
                for(int i=1; i<n+1; i++) {
                    if(arr[curr][i] == 1 && !visited[i]) {
                        visited[i] = true;
                        q.offer(i);
                        if(i == b) {eq = true; break;}
                    }
                }
            }
            level++;
        }
        
        level = visited[b] == false ? -1 : level;
        System.out.println(level);
    }
}
