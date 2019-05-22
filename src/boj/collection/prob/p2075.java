package boj.collection.prob;

import java.util.PriorityQueue;
import java.util.Scanner;

public class p2075 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++)
                pq.offer(sc.nextInt());
            while(pq.size() > n) {
                pq.poll();
            }
        }
        System.out.println(pq.peek());
    }
}
