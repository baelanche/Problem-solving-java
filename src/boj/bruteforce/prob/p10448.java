package boj.bruteforce.prob;

import java.util.Scanner;

public class p10448 {
	
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        boolean eq = false;
        
        while(t-->0){
            int x = sc.nextInt();
            
            for(int i=1; i<=43; i++) {
                for(int j=1; j<=43; j++) {
                    for(int k=1; k<=43; k++) {
                        int sum = (i*(i+1)/2) + (j*(j+1)/2) + (k*(k+1)/2);
                        if(sum == x){
                            eq = true;
                            break;
                        }
                    }
                    if(eq) break;
                }
                if(eq) break;
            }
            if(eq) System.out.println(1);
            else System.out.println(0);
            eq = false;
        }
    }
}
