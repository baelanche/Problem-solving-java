package boj.collection.prob;

import java.util.PriorityQueue;
import java.util.Scanner;

public class p2014 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        
        int k = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[k];
        for(int i=0; i<k; i++) {
            a[i] = sc.nextInt();
            pq.offer((long)a[i]);
        }
        for(int i=1; i<n; i++) {
            long top = pq.poll();
            for(int j=0; j<k; j++) {
                long push = top * a[j];
                pq.offer(push);
                if(top % a[j] == 0) break;
            }
            
        }
        System.out.println(pq.peek());
    }
}
