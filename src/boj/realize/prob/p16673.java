package boj.realize.prob;

import java.util.Scanner;

public class p16673 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int c = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        
        int wine = 0;
        for(int i=1; i<=c; i++)
            wine += k*i + p*i*i;
        
        System.out.println(wine);
    }
}
