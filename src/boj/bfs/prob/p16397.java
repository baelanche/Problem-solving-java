package boj.bfs.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p16397 {

	static int t;
    static int g;
    static int max = 100000;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        t = sc.nextInt();
        g = sc.nextInt();
        
        int ans = bfs(n);
        System.out.println(ans == -1 ? "ANG" : ans);
    }
    
    public static int bfs(int n) {
        Queue<Pair> queue = new LinkedList<Pair>();
        boolean visited[] = new boolean[max];
        
        queue.offer(new Pair(n, 0));
        visited[n] = true;
        
        while(!queue.isEmpty()) {
            Pair point = queue.poll();
            if(point.cnt > t) break;
            if(point.n == g) return point.cnt;
            
            int plusOne = point.n + 1;
            if(plusOne < max && !visited[plusOne]) {
                visited[plusOne] = true;
                queue.offer(new Pair(plusOne, point.cnt + 1));
            }
            
            int makeDouble = makeDouble(point.n);
            if(makeDouble >= max) continue;
            
            int minusHeadOne = minusHeadOne(makeDouble);
            if(minusHeadOne < max && !visited[minusHeadOne]) {
                visited[minusHeadOne] = true;
                queue.offer(new Pair(minusHeadOne, point.cnt + 1));
            }
        }
        return -1;
    }
    
    public static int makeDouble(int n) {
        return n * 2;
    }
    
    public static int minusHeadOne(int n) {
        if(n == 0) return 0;
        for(int i=10; true; i*=10) {
            if(i > n) {
                n -= i/10;
                break;
            }
        }
        return n;
    }
    
    static class Pair {
        int n;
        int cnt;
        
        Pair(int n, int cnt) {
            this.n = n;
            this.cnt = cnt;
        }
    }
}
