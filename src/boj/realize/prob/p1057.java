package boj.realize.prob;

import java.util.Scanner;

public class p1057 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int i;
        boolean m = false;
        for(i=1; n>=2; i++) {
            int arr[] = new int[n+1];
            arr[a] = 1;
            arr[b] = 1;
            for(int start=1; start<n; start+=2) {
                if(arr[start] == 1 && arr[start+1] == 1) {
                    m = true;
                    break;
                }
            }
            if(m) break;
            if(n % 2 == 0) n /= 2;
            else n = n/2 + 1;
            
            if(a % 2 == 0) a /= 2;
            else a = a/2 + 1;
            
            if(b % 2 == 0) b /= 2;
            else b = b/2 + 1;
        }
        
        if(m) System.out.println(i);
        else System.out.println(-1);
    }
}
