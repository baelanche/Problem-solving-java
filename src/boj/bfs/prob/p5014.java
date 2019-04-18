package boj.bfs.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p5014 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int f = sc.nextInt();
        int s = sc.nextInt();
        int g = sc.nextInt();
        int u = sc.nextInt();
        int d = sc.nextInt();
        
        Queue<Integer> queue = new LinkedList<Integer>();
        int a[] = new int[f+1];
        boolean visited[] = new boolean[f+1];
        
        int mx[] = {u, -d};
        boolean success = false;
        
        queue.offer(s);
        a[s]= 0;
        visited[s] = true;
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            while(size-->0) {
                int me = queue.poll();
                if(me == g) success = true;
                for(int i=0; i<2; i++) {
                    int nx = me + mx[i];
                    if(1 <= nx && nx < f+1) {
                        if(!visited[nx]) {
                            visited[nx] = true;
                            queue.offer(nx);
                            a[nx] = a[me] + 1;
                        }
                    }
                }
            }
        }
        System.out.println(success == true ? a[g] : "use the stairs");
    }
}
