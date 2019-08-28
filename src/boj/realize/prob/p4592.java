package boj.realize.prob;

import java.util.Scanner;

public class p4592 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            
            if(n == 0) break;
            
            StringBuilder sb = new StringBuilder();
            
            int req = 0;
            while(n-->0) {
                int a = sc.nextInt();
                if(req != a) {
                    sb.append(a + " ");
                    req = a;
                }
            }
            
            System.out.println(sb.toString() + "$");
        }
    }
}
