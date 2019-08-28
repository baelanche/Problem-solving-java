package boj.realize.prob;

import java.util.Scanner;

public class p9243 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        char c1[] = sc.next().toCharArray();
        char c2[] = sc.next().toCharArray();
        
        while(n-->0) {
            for(int i=0; i<c1.length; i++) {
                if(c1[i] == '0') c1[i] = '1';
                else c1[i] = '0';
            }
        }
        
        for(int i=0; i<c1.length; i++)
            if(c1[i] != c2[i]) {
                System.out.println("Deletion failed");
                return;
            }
        
        System.out.println("Deletion succeeded");
    }
}
