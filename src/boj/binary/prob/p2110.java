package boj.binary.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p2110 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int c = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        Arrays.sort(a);
        int left = a[0];
        int right = a[n-1] - a[0];
        while(left <= right) {
            int mid = (left + right)/2;
            int prev = a[0];
            int cnt = 1;
            for(int i=1; i<n; i++) {
                int distance = a[i] - prev;
                if(mid <= distance) {
                    cnt++;
                    prev = a[i];
                }
            }
            if(cnt >= c) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println(left - 1);
    }
}
