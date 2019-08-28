package boj.realize.prob;

import java.util.Scanner;

public class p2863 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        
        int seq = 0;
        double max = 0;
        for(int i=0; i<4; i++) {
            double sum = a/c + b/d;
            if(max < sum) {
                max = sum;
                seq = i;
            }
            
            double tmp = a;
			a=c;
            c=d;
            d=b;
            b=tmp;
        }
        System.out.println(seq);
    }
}
