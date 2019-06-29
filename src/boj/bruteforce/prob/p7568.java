package boj.bruteforce.prob;

import java.util.Scanner;

public class p7568 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[][] = new int[n][3];
        for(int i=0; i<n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++) {
            int rank = 1;
            for(int j=0; j<n; j++)
                if(a[i][0] < a[j][0] && a[i][1] < a[j][1])
                    rank++;
            a[i][2] = rank;
        }
        
        for(int i=0; i<n; i++)
            System.out.print(a[i][2] + " ");
    }
}
