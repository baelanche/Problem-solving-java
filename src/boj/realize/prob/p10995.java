package boj.realize.prob;

import java.util.Scanner;

public class p10995 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            if(i%2 == 0) {
                for(int j=0; j<n; j++) {
                    System.out.print("*");
                    if(j != n-1) System.out.print(" ");
                }
            } else {
                for(int j=0; j<n; j++)
                    System.out.print(" *");
            }
            System.out.println();
        }
    }
}
