package boj.binary.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p10815 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        
        int m = sc.nextInt();
        while(m-->0) {
            int card = sc.nextInt();
            
            int left = 0;
            int right = n-1;
            
            while(left + 1 < right) {
                int mid = (left + right)/2;
                if(a[mid] <= card) left = mid;
                else right = mid;
            }
            if(left == n-2 && a[left+1] ==card) System.out.print(1);
            else System.out.print(a[left] == card ? 1 : 0);
            System.out.print(" ");
        }
    }
}
