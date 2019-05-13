package boj.realize.prob;

import java.util.Scanner;

public class p13015 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int len = 1;
        int blank = 0;
        for(int i=2; i<n; i++) len += 2;
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<blank; j++) System.out.print(" ");
            for(int j=0; j<n; j++) {
                if(i == 0)
                    System.out.print("*");
                else {
                    if(j == 0 || j == n-1) {
                        if(i == n-1 && j == n-1) continue;
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
            }
            for(int j=0; j<len; j++) System.out.print(" ");
            blank++;
            len -= 2;
            for(int j=0; j<n; j++) {
                if(i == 0)
                    System.out.print("*");
                else {
                    if(j == 0 || j == n-1) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
        len = 1;
        blank--;
        for(int i=0; i<n-1; i++) {
            blank--;
            for(int j=0; j<blank; j++) System.out.print(" ");
            for(int j=0; j<n; j++) {
                if(i == n-2)
                    System.out.print("*");
                else {
                    if(j == 0 || j == n-1) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            for(int j=0; j<len; j++) System.out.print(" ");
            for(int j=0; j<n; j++) {
                if(i == n-2)
                    System.out.print("*");
                else {
                    if(j == 0 || j == n-1) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
            len += 2;
        }
    }
}
