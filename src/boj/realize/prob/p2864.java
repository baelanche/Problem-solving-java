package boj.realize.prob;

import java.util.Scanner;

public class p2864 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println((makeMin(a) + makeMin(b)) + " " + (makeMax(a) + makeMax(b)));
    }
    
    public static int makeMin(int a) {
        String temp = "";
        while(a != 0) {
            if(a%10 == 6)
                temp = 5 + temp;
            else
                temp = a%10 + temp;
            a /= 10;
        }
        return Integer.parseInt(temp);
    }
    
    public static int makeMax(int a) {
        String temp = "";
        while(a != 0) {
            if(a%10 == 5)
                temp = 6 + temp;
            else
                temp = a%10 + temp;
            a /= 10;
        }
        return Integer.parseInt(temp);
    }
}
