package boj.realize.prob;

import java.util.Scanner;

public class p10996 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0; i<2*n; i++) {
            if(i%2 == 0) {
                for(int j=0; j<n; j++) {
                    if(j%2 == 0) System.out.print("*");
                    else if(j%2 == 1 && j != n-1) System.out.print(" ");
                }
            } else {
                for(int j=0; j<n; j++) {
                    if(j%2 == 0) System.out.print(" ");
                    else System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
