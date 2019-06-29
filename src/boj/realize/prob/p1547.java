package boj.realize.prob;

import java.util.Scanner;

public class p1547 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int a[] = new int[4];
        a[1] = 1;
        
        while(m-->0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            swap(a, x, y);
        }
        
        for(int i=1; i<=3; i++)
            if(a[i] == 1)
                System.out.println(i);
    }
    
    public static void swap(int a[], int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
