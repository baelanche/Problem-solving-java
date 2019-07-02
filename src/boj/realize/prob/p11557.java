package boj.realize.prob;

import java.util.Scanner;

public class p11557 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String u = "";
            int max = 0;
            while(n-->0) {
                String s = sc.next();
                int l = sc.nextInt();
                if(max < l) {
                    max = l;
                    u = s;
                }
            }
            System.out.println(u);
        }
    }
}
