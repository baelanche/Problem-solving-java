package boj.math.prob;

import java.util.Scanner;

public class p14583 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        
        double d = Math.sqrt(w*w + h*h);
        
        double a = h*w / (d+w);
        double b = h*d / (d+w);
        double c = Math.sqrt(a*a + w*w);
        
        System.out.printf("%.2f %.2f", c/2, b*w/c);
    }
}
