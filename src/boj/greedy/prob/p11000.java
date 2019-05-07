package boj.greedy.prob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class p11000 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[][] = new int[n][2];
        
        for(int i=0; i<n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        
        Arrays.sort(a, new Comparator<int[]>() {
           public int compare(int start[], int end[]) {
               if(start[0] == end[0])
                   return start[1] - end[1];
               return start[0] - end[0];
           }
        });
        
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        
        for(int i=0; i<n; i++) {
            int end = a[i][1];
            if(!q.isEmpty() && q.peek() <= a[i][0])
                q.poll();
            q.offer(end);
        }
        System.out.println(q.size());
    }
}
