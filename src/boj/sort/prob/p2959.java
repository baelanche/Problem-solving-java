package boj.sort.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p2959 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[4];
        for(int i=0; i<4; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        
        int width = a[3] - (a[3] - a[2]);
        int height = a[1] - (a[1] - a[0]);
        
        System.out.println(width * height);
    }
}
