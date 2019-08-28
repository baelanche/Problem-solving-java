package boj.realize.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p11948 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int science[] = new int[4];
        int society[] = new int[2];
        
        for(int i=0; i<4; i++) science[i] = sc.nextInt();
        for(int i=0; i<2; i++) society[i] = sc.nextInt();
        
        Arrays.sort(science);
        Arrays.sort(society);
        
        System.out.println(science[1] + science[2] + science[3] + society[1]);
    }
}
