package boj.realize.prob;

import java.util.Scanner;

public class p13410 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int max = 0;
        for(int i=1; i<=k; i++) {
            int num = n*i;
            String snum = String.valueOf(num);
            String temp = "";
            for(int j=0; j<snum.length(); j++)
                temp = snum.charAt(j) + temp;
            
            max = Math.max(max, Integer.parseInt(temp));
        }
        System.out.println(max);
    }
}
