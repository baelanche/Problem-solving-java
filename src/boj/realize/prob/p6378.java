package boj.realize.prob;

import java.util.Scanner;

public class p6378 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String n = sc.next();
            if(n.equals("0")) break;
            
            while(true) {
                if(n.length() == 1) {
                    System.out.println(n);
                    break;
                }
                int sum = 0;
                for(int i=0; i<n.length(); i++)
                    sum += n.charAt(i) - '0';
                
                n = String.valueOf(sum);
            }
        }
    }
}
