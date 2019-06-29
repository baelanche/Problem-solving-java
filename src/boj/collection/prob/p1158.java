package boj.collection.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p1158 {

	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i=1; i<=n; i++)
            q.offer(i);
        
        String s = "<";
        while(!q.isEmpty()) {
            for(int i=0; i<k-1; i++)
                q.offer(q.poll());
            
            s += q.poll() + ", ";
        }
        
        System.out.println(s.substring(0, s.length()-2) + ">");
	    }
}
