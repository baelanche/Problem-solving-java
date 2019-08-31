package boj.realize.prob;

import java.util.Scanner;

public class p1284 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            char c[] = sc.next().toCharArray();
            
            if(c.length == 1 && c[0] == '0') break;
            
            int width = 0;
            width += c.length + 1;
            for(int i=0; i<c.length; i++) {
                if(c[i] == '0') width += 4;
                else if(c[i] == '1') width += 2;
                else width += 3;
            }
            System.out.println(width);
        }
    }
}
