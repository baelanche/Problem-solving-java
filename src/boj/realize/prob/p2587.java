package boj.realize.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p2587 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        
        Arrays.sort(a);
        System.out.println(sum/5);
        System.out.println(a[2]);
    }
}
