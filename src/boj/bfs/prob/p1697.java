package boj.bfs.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p1697 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[100001];
        boolean visited[] = new boolean[100001];
        Queue<Integer> queue = new LinkedList<Integer>();
        
        queue.offer(n);
        visited[n] = true;
        a[n] = 0;
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            while(size-->0) {
                int me = queue.poll();
                int mx[] = {-1, 1, me};
                for(int i=0; i<3; i++) {
                    int nx = me + mx[i];
                    if(0 <= nx && nx < a.length) {
                        if(!visited[nx]) {
                            visited[nx] = true;
                            queue.offer(nx);
                            a[nx] = a[me] + 1;
                        }
                    }
                }
            }
        }
        System.out.println(a[k]);
    }
}
