package boj.realize.prob;

import java.util.Scanner;

public class p5717 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int m = sc.nextInt();
            int f = sc.nextInt();
            
            if(m == 0 && f == 0) break;
            
            System.out.println(m + f);
        }
    }
}
