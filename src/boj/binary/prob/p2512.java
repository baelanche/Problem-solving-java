package boj.binary.prob;

import java.util.Scanner;

public class p2512 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        int max = 0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            if(a[i] > max) max = a[i];
        }
        int m = sc.nextInt();
        
        int low = 0;
        int high = max;
        while(low <= high) {
            int mid = (low + high)/2;
            long sum = 0;
            for(int i=0; i<n; i++) {
                if(a[i] < mid) sum += a[i];
                else sum += mid;
            }
            if(sum <= m) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println(high);
    }
}
