package boj.greedy.prob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p1931 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[][] = new int[n][2];
        
        for(int i=0; i<n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        
        Arrays.sort(a, new Comparator<int[]>() {
            public int compare(int[] start, int[] end) {
                if(start[1] == end[1]) {
                    return Integer.compare(start[0], end[0]);
                }
                return Integer.compare(start[1], end[1]);
            }
        });
        
        int cnt = 0;
        int preend = 0;
        for(int i=0; i<a.length; i++) {
            int s = a[i][0];
            int e = a[i][1];
            if(preend > s) continue;
            else {
                cnt++;
                preend = e;
            }
        }
        System.out.println(cnt);
    }
}
