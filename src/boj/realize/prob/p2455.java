package boj.realize.prob;

import java.util.Scanner;

public class p2455 {

static int max = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int people = 0;
        for(int i=0; i<4; i++) {
            int a[] = {sc.nextInt(), sc.nextInt()};
            people = simulation(people, a[0], a[1]);
        }
        System.out.println(max);
    }
    
    public static int simulation(int people, int a, int b) {
        people -= a;
        people += b;
        max = max(max, people);
        return people;
    }
    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
