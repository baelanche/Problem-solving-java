package boj.realize.prob;

import java.util.Scanner;

public class p10990 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            for(int j=i; j<n-1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1; j<i*2; j++) {
                System.out.print(" ");
            }
            if(i!=0)
                System.out.print("*");
            System.out.println();
        }
    }
}
