package boj.realize.prob;

import java.util.Scanner;

public class p16678 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[100001];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            int temp = sc.nextInt();
            min = Math.min(min, temp);
            max = Math.max(max, temp);
            a[temp]++;
        }
        
        int left = 1;
        int right = min;
        long cnt = 0;
        while(right <= max) {
            if(a[left] > 0) {
                left++;
                if(left > right)
                    right++;
            } else {
                if(a[right] == 0)
                    right++;
                else {
                    a[right]--;
                    a[left]++;
                    cnt += right - left;
                }
            }
        }
        System.out.println(cnt);
    }
}
