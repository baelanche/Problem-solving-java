package boj.sort.prob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p11651 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[][] = new int[n][2];
        for(int i=0; i<n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        
        Arrays.sort(a, new Comparator<int[]>() {
           public int compare(int o1[], int o2[]) {
               if(o1[1] == o2[1])
                   return o1[0] - o2[0];
               else return o1[1] - o2[1];
           } 
        });
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
