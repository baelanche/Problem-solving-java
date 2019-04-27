package boj.realize.prob;

import java.util.Scanner;

public class p11292 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            String s[][] = new String[n][2];
            if(n==0) break;
            float max = 0;
            for(int i=0; i<n; i++) {
                s[i][0] = sc.next();
                s[i][1] = sc.next();
                max = Float.parseFloat(s[i][1]) > max ? Float.parseFloat(s[i][1]) : max;
            }
            String name = "";
            for(int i=0; i<n; i++)
                if(Float.parseFloat(s[i][1]) == max)
                    name += s[i][0] + " ";
            System.out.println(name);
        }
    }
}
