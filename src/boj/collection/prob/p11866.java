package boj.collection.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p11866 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        
        Queue<Integer> q = new LinkedList();
        for(int i=1; i<=n; i++)
            q.offer(i);
        
        int seq = 0;
        while(!q.isEmpty()) {
            for(int i=0; i<k-1; i++)
                q.offer(q.poll());
            a[seq] = q.poll();
            seq++;
        }
        
        System.out.print("<");
        for(int i=0; i<n; i++) {
            System.out.print(a[i]);
            if(i != n-1) System.out.print(", ");
            else System.out.print(">");
        }
    }
}
