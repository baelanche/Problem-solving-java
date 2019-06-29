package boj.realize.prob;

import java.util.Scanner;

public class p11365 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String s = sc.nextLine();
            if(s.equals("END")) break;
            for(int i=s.length()-1; i>=0; i--)
                System.out.print(s.charAt(i));
            System.out.println();
        }
    }
}
