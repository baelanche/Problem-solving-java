package boj.realize.prob;

import java.util.Scanner;

public class p5361 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = 350.34;
        double b = 230.90;
        double c = 190.55;
        double d = 125.30;
        double e = 180.90;
        
        int t = sc.nextInt();
        while(t-->0) {
            int y = sc.nextInt();
            int u = sc.nextInt();
            int i = sc.nextInt();
            int o = sc.nextInt();
            int p = sc.nextInt();
            double sum = a*y + b*u + c*i + d*o + e*p;
            System.out.printf("$%.2f\n", sum);
        }
    }
}
