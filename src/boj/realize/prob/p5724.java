package boj.realize.prob;

import java.util.Scanner;

public class p5724 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            
            if(n == 0) break;
            
            int sum = 0;
            for(int i=n; i>=1; i--) sum += i*i;
            System.out.println(sum);
        }
    }
}
