package boj.realize.prob;

import java.util.Scanner;

public class p15351 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0) {
            char c[] = sc.nextLine().toCharArray();
            
            int lifescore = 0;
            for(int i=0; i<c.length; i++) {
                if(c[i] >= 'A' && c[i] <= 'Z')
                    lifescore += c[i] - 'A' + 1;
            }
            
            System.out.println(lifescore == 100 ? "PERFECT LIFE" : lifescore);
        }
    }
}
