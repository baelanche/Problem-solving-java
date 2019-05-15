package boj.binary.prob;

import java.util.Scanner;

public class p1300 {
	    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long k = sc.nextLong();
        
        long left = 0;
        long right = (long)n*n;
        while(left <= right) {
            long mid = (left + right)/2;
            long cnt = 0;
            for(int i=1; i<=n; i++) {
                long num = mid / i;
                cnt += num > n ? n : num;
            }
            if(cnt >= k) right = mid - 1;
            else left = mid + 1;
        }
        System.out.println(left);
    }
}
