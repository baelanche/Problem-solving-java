package boj.math.prob;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p3053 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("0.000000");
        
        int r = sc.nextInt();
        
        double uclid = r*r*Math.PI;
        double taxi = (2*r)*(2*r)/2;
        System.out.println(df.format(uclid));
        System.out.println(df.format(taxi));
        sc.close();
    }
}
