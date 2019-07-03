package boj.realize.prob;

import java.util.Scanner;

public class p14429 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int game = 0;
        int minGame = 1;
        int min = Integer.MAX_VALUE;
        while(n-->0) {
            int j = sc.nextInt();
            int m = sc.nextInt();
            
            game++;
            int cnt = 0;
            int r = (j-1) % (1+m);
            while(r < j) {
                r += 1 + m;
                cnt += 2;
            }
            if(min > cnt) {
                min = cnt;
                minGame = game;
            }
        }
        System.out.println(minGame + " " + min);
    }
}
