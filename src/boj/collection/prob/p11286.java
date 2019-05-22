package boj.collection.prob;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class p11286 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a1, Integer a2) {
                Integer n = Math.abs(a1);
                Integer m = Math.abs(a2);
                
                if(n < m) return -1;
                else if(n > m) return 1;
                else {
                    if(a1 < a2) return -1;
                    else if(a1 > a2) return 1;
                    else return 0;
                }
            }
        });
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            if(x == 0) {
                if(pq.isEmpty()) System.out.println(0);
                else System.out.println(pq.poll());
            } else pq.offer(x);
        }
    }
}
