package boj.bruteforce;

import java.util.Scanner;

public class p2231 {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int i=0, sum=0;
        while(i<=n){
            i++;
            int se = i;
            sum = se;
            while(se >= 1){
                int div = se%10;
                se /= 10;
                sum += div;
            }
            if(sum == n){
                System.out.println(i);
                break;
            }
            if(i == n)
                System.out.println(0);
        }
    }
}
