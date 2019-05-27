package boj.collection.prob;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class p2696 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            int m = sc.nextInt();
            int a[] = new int[m];
            StringBuilder sb = new StringBuilder();
            PriorityQueue<Integer> min = new PriorityQueue<Integer>();
            PriorityQueue<Integer> max = new PriorityQueue<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            for(int i=0; i<m; i++)
                a[i] = sc.nextInt();
            
            sb.append(m%2 == 0 ? m/2 + "\n" : m/2+1 + "\n");
            int cnt = 0;
            for(int i=0, mid=a[0]; i<m; i++) {
                if(mid > a[i]) max.offer(a[i]);
                else min.offer(a[i]);
                
                if(i%2 == 0) {
                    while(max.size() != min.size()) {
                        if(max.size() > min.size()) {
                            if(i != 0) min.offer(mid);
                            mid = max.poll();
                        } else {
                            if(i != 0) max.offer(mid);
                            mid = min.poll();
                        }
                    }
                    cnt++;
                    sb.append(mid + " ");
                    if(cnt == 10) {
                        sb.append("\n");
                        cnt = 0;
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}
