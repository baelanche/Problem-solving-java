package boj.realize.prob;

import java.util.Scanner;

public class p10874 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int ans[] = new int[10];
        for(int i=0; i<10; i++)
            ans[i] = (i%5) + 1;
        
        for(int i=1; i<=n; i++) {
            int a[] = new int[10];
            for(int j=0; j<10; j++)
                a[j] = sc.nextInt();
            
            boolean s = true;
            for(int j=0; j<10; j++)
                if(a[j] != ans[j]) s = false;
            
            if(s) System.out.println(i);
        }
    }
}
