package boj.greedy.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p2217 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        Arrays.sort(a);
        
        int max = 0;
        for(int i=0; i<n; i++) {
            int cnt = 0;
            for(int j=i; j<n; j++)
                cnt++;
            if(max < a[i]*cnt)
                max = a[i]*cnt;
        }
        System.out.println(max);
    }
}
