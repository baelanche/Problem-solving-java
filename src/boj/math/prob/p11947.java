package boj.math.prob;

import java.util.Scanner;

public class p11947 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            int k = sc.nextInt();
            
            for(long i=10; true; i*=10) {
                if(k < i) {
                    if(k < i/2) System.out.println(k * reverse(k));
                    else System.out.println(i/2 * reverse(i/2));
                    break;
                }
            }
        }
    }
    
    public static Long reverse(long k) {
        String num = String.valueOf(k);
        String temp = "";
        for(int i=0; i<num.length(); i++)
            temp += 9 - (num.charAt(i) - '0');
        
        return Long.parseLong(temp);
    }
}
