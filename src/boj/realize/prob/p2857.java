package boj.realize.prob;

import java.util.Scanner;

public class p2857 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String ans = "";
        for(int i=1; i<=5; i++) {
            String s = sc.next();
            if(s.contains("FBI")) ans += i + " ";
        }
        
        if(ans.equals("")) System.out.println("HE GOT AWAY!");
        else System.out.println(ans);
    }
}
