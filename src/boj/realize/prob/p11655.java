package boj.realize.prob;

import java.util.Scanner;

public class p11655 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c[] = sc.nextLine().toCharArray();
        for(int i=0; i<c.length; i++) {
            if(c[i] >= 'a' && c[i] <= 'z') System.out.print((char)((c[i] - 'a' + 13) % 26 + 'a'));
            else if(c[i] >= 'A' && c[i] <= 'Z') System.out.print((char)((c[i] - 'A' + 13) % 26 + 'A'));
            else System.out.print(c[i]);
        }
    }
}
