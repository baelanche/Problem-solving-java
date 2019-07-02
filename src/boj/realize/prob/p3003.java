package boj.realize.prob;

import java.util.Scanner;

public class p3003 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int king = 1 - sc.nextInt();
        int queen = 1 - sc.nextInt();
        int rook = 2 - sc.nextInt();
        int bishop = 2 - sc.nextInt();
        int knight = 2 - sc.nextInt();
        int pawn = 8 - sc.nextInt();
        
        System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
    }
}
