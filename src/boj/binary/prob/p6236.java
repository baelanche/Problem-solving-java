package boj.binary.prob;

import java.util.Scanner;

public class p6236 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int left = 0;
        int right = 0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            left = a[i] > left ? a[i] : left;
            right += a[i];
        }
        
        while(left <= right) {
            int mid = (left + right)/2;
            int sum = 0;
            int cnt = 0;
            for(int i=0; i<n; i++) {
                if(sum + a[i] > mid) {
                    sum = 0;
                    cnt++;
                }
                sum += a[i];
            }
            if(sum != 0) cnt++;
            if(cnt <= m) right = mid - 1;
            else left = mid + 1;
        }
        System.out.println(left);
    }
}
