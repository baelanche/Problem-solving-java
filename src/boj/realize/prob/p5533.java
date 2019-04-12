package boj.realize.prob;

import java.util.Scanner;

public class p5533 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[][] = new int[n][3];
        int score[] = new int[n];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        int sum = 0;
        for(int i=0; i<3; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    if(j==k) continue;
                    if(a[j][i] != a[k][i]) sum = a[j][i];
                    else {sum = 0; break;}
                }
                score[j] += sum;
                sum = 0;
            }
        }
        
        for(int i=0; i<n; i++)
            System.out.println(score[i]);
        sc.close();
    }
}
