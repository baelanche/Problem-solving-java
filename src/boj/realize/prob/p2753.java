package boj.realize.prob;

import java.util.Scanner;

public class p2753 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n % 4 == 0 && n % 100 != 0)
            System.out.println(1);
        else if(n % 400 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
