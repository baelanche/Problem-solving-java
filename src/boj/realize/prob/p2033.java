package boj.realize.prob;

import java.util.Scanner;

public class p2033 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double n = sc.nextInt();
        
        int k = 1;
        for(int i=10; true; i*=10) {
            if(n > i) {
                int pow = (int)Math.pow(10, k);
                n /= pow;
                n = Math.round(n);
                n *= pow;
            } else break;
            k++;
        }
        System.out.println((int)n);
        sc.close();
    }
}
