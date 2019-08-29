package boj.realize.prob;

import java.util.Scanner;

public class p10769 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c[] = sc.nextLine().toCharArray();
        
        int happy = 0;
        int sad = 0;
        
        for(int i=0; i<c.length; i++) {
            if(c[i] == ':' && i+1 < c.length && c[i+1] == '-' && i+2 < c.length && c[i+2] == ')')
                happy++;
            if(c[i] == ':' && i+1 < c.length && c[i+1] == '-' && i+2 < c.length && c[i+2] == '(')
                sad++;
        }
        if(happy > sad)
            System.out.println("happy");
        else if(happy == sad && happy != 0)
            System.out.println("unsure");
        else if(happy == sad && happy == 0)
            System.out.println("none");
        else if(happy < sad)
            System.out.println("sad");
    }
}
