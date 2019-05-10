package boj.binary.prob;

import java.util.Scanner;

public class p1654 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[k];
        for(int i=0; i<k; i++)
            a[i] = sc.nextInt();
        long low = 0;
        long high = (1 << 31) - 1;
        while(low <= high) {
            long mid = (low + high)/2;
            int cnt = 0;
            for(int i=0; i<k; i++)
                cnt += a[i] / mid;
            if(cnt < n) high = mid - 1;
            else low = mid + 1;
        }
        System.out.println(high);
    }
}
