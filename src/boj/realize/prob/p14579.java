package boj.realize.prob;

import java.util.Scanner;

public class p14579 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int k = a;
        long ans = 1;
        while(k <= b) {
            int sum = 0;
            for(int i=1; i<=k; i++)
                sum += i;
            
            sum %= 14579;
            ans *= sum;
            ans %= 14579;
            
            k++;
        }
        
        System.out.println(ans);
    }
}
