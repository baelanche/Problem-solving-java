package boj.realize.prob;

import java.util.Scanner;

public class p5218 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while(n-->0) {
            char c1[] = sc.next().toCharArray();
            char c2[] = sc.next().toCharArray();
            
            StringBuilder sb = new StringBuilder("Distances: ");
            for(int i=0; i<c1.length; i++) {
                int distance = c2[i] - c1[i];
                if(distance < 0) distance += 26;
                sb.append(distance + " ");
            }
            System.out.println(sb.toString());
        }
    }
}
