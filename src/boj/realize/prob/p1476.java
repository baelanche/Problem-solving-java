package boj.realize.prob;

import java.util.Scanner;

public class p1476 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        
        int year = 1;
        int ce = 1;
        int cs = 1;
        int cm = 1;
        while(true) {
            if(ce == e && cs == s && cm == m) break;
            ce = ce+1 > 15 ? 1 : ce+1;
            cs = cs+1 > 28 ? 1 : cs+1;
            cm = cm+1 > 19 ? 1 : cm+1;
            year++;
        }
        
        System.out.println(year);
    }
}
