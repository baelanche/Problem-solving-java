package boj.realize.prob;

import java.util.Scanner;

public class p1075 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int f = sc.nextInt();
        
        String s = String.valueOf(n);
        
        for(int i=0; i<=99; i++) {
            s = s.substring(0, s.length()-2);
            String temp = "";
            if(i < 10) temp = temp + 0 + i;
            else temp = temp + i;
            
            s = s + temp;
            
            int num = Integer.parseInt(s);
            if(num % f == 0) {
                System.out.println(temp);
                break;
            }
        }
    }
}
