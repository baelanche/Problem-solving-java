package boj.math.prob;

import java.util.Scanner;

public class p11653 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=2; i<=n; i++) {
            if(n % i == 0) {
                n /= i;
                System.out.println(i);
                i = 1;
            }
        }
    }
}
