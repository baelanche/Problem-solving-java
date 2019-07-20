package boj.realize.prob;

import java.util.Scanner;

public class p16675 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String ml = sc.next();
        String mr = sc.next();
        String tl = sc.next();
        String tr = sc.next();
        
        if(ml.equals("S") && mr.equals("S")) {
            if(tl.equals("R") || tr.equals("R"))
                System.out.println("TK");
            else if(tl.equals("P") && tr.equals("P"))
                System.out.println("MS");
            else System.out.println("?");
        } else if(ml.equals("R") && mr.equals("R")) {
            if(tl.equals("P") || tr.equals("P"))
                System.out.println("TK");
            else if(tl.equals("S") && tr.equals("S"))
                System.out.println("MS");
            else System.out.println("?");
        } else if(ml.equals("P") && mr.equals("P")) {
            if(tl.equals("S") || tr.equals("S"))
                System.out.println("TK");
            else if(tl.equals("R") && tr.equals("R"))
                System.out.println("MS");
            else System.out.println("?");
        } else if(tl.equals("S") && tr.equals("S")) {
            if(ml.equals("R") || mr.equals("R"))
                System.out.println("MS");
            else if(ml.equals("P") && mr.equals("P"))
                System.out.println("TK");
            else System.out.println("?");
        } else if(tl.equals("R") && tr.equals("R")) {
            if(ml.equals("P") || mr.equals("P"))
                System.out.println("MS");
            else if(ml.equals("S") && mr.equals("S"))
                System.out.println("TK");
            else System.out.println("?");
        } else if(tl.equals("P") && tr.equals("P")) {
            if(ml.equals("S") || mr.equals("S"))
                System.out.println("MS");
            else if(ml.equals("R") && mr.equals("R"))
                System.out.println("TK");
            else System.out.println("?");
        } else System.out.println("?");
    }
}
