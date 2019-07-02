package boj.binary.prob;

import java.util.Scanner;

public class p16510 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n+1];
        for(int i=0; i<n; i++)
            a[i+1] = a[i] + sc.nextInt();
        
        while(m-->0) {
            int t = sc.nextInt();
            
            int left = 1;
            int right = n;
            while(left <= right) {
                int mid = (left + right)/2;
                if(a[mid] > t) right = mid-1;
                else left = mid+1;
            }
            System.out.println(right);
        }
    }
}
