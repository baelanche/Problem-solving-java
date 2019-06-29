package boj.realize.prob;

import java.util.Scanner;

public class p2525 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        a += c/60;
        b += c%60;
        if(b > 59) {
            b -= 60;
            a++;
        }
        
        a %= 24;
        
        System.out.println(a + " " + b);
    }
}
