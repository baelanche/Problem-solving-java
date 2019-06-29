package boj.math.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p2312 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            Queue<Integer> q = new LinkedList<Integer>();
            int x = sc.nextInt();
            
            for(int i=2; i<=x; i++) {
                if(x % i == 0) {
                    q.offer(i);
                    x /= i;
                    i = 1;
                }
            }
            int num = q.peek();
            int cnt = 0;
            while(!q.isEmpty()) {
                int now = q.poll();
                if(num == now)
                    cnt++;
                else {
                    System.out.println(num + " " + cnt);
                    num = now;
                    cnt = 1;
                }
            }
            System.out.println(num + " " + cnt);
        }
    }
}
