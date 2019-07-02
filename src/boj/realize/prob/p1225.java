package boj.realize.prob;

import java.util.Scanner;

public class p1225 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        long sum = 0;
        for(int i=0; i<a.length(); i++)
            for(int j=0; j<b.length(); j++)
                sum += (a.charAt(i) - '0') * (b.charAt(j) - '0');
        
        System.out.println(sum);
    }
}
