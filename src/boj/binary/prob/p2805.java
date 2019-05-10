package boj.binary.prob;

import java.util.Scanner;

public class p2805 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        int low = 0;
        int high = 1000000000;
        while(low <= high) {
            int mid = (low + high)/2;
            long sum = 0;
            for(int i=0; i<n; i++)
                if(a[i] > mid) sum += a[i] - mid;
            if(sum >= m) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println(high);
    }
}
