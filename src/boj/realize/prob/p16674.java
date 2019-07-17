package boj.realize.prob;

import java.util.Scanner;

public class p16674 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c[] = sc.next().toCharArray();
        int a[] = new int[10];
        
        for(int i=0; i<c.length; i++)
            a[c[i] - '0']++;
        
        if(a[3] > 0 || a[4] > 0 || a[5] > 0 || a[6] > 0 || a[7] > 0 || a[9] > 0)
            System.out.println(0);
        else {
            if(a[0] == a[1] && a[1] == a[2] && a[2] == a[8])
                System.out.println(8);
            else if(a[0] > 0 && a[1] > 0 && a[2] > 0 && a[8] > 0)
                System.out.println(2);
            else System.out.println(1);
        }
    }
}
