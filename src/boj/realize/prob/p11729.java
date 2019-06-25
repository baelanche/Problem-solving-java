package boj.realize.prob;

import java.util.Scanner;

public class p11729 {

	static int cnt = 0;
    static StringBuilder sb = new StringBuilder();
    
    public static void move(int from, int to) {
        cnt++;
        sb.append(from + " " + to + "\n");
    }
    
    public static void hanoi(int n, int from, int by, int to) {
        if(n == 1)
            move(from, to);
        else {
            hanoi(n-1, from, to, by);
            move(from, to);
            hanoi(n-1, by, from, to);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        
        hanoi(k, 1, 2, 3);
        
        System.out.println(cnt);
        System.out.println(sb.toString());
    }
}
