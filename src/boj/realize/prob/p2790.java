package boj.realize.prob;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p2790 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Integer a[] = new Integer[n];
        
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        Arrays.sort(a, Collections.reverseOrder());
        
        int cnt = 0;
        int need = 0;
        for(int i=0; i<n; i++) {
            need = max(need, a[i] + i + 1);
            if(a[i] + n >= need)
                cnt++;
        }
        System.out.println(cnt);
    }
    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
