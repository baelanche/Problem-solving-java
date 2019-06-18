package boj.realize.prob;

import java.util.Scanner;

public class p10757 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char a[] = sc.next().toCharArray();
        char b[] = sc.next().toCharArray();
        
        String sum = "";
        int al = a.length - 1;
        int bl = b.length - 1;
        int upper = 0;
        while(al >= 0 || bl >= 0) {
            int s = 0;
            if(al >= 0 && bl >= 0) s = (a[al] - '0') + (b[bl] - '0') + upper;
            else if(al >= 0 && bl < 0) s = (a[al] - '0') + upper;
            else if(al < 0 && bl >= 0) s = (b[bl] - '0') + upper;
            upper = s/10;
            sum = s%10 + sum;
            al--;
            bl--;
        }
        System.out.println(upper == 1 ? upper + sum : sum);
    }
}
