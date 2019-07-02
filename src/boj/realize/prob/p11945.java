package boj.realize.prob;

import java.util.Scanner;

public class p11945 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int a[][] = new int[n][m];
	        int b[][] = new int[n][m];
	        sc.nextLine();
	        for(int i=0; i<n; i++) {
	            String s = sc.nextLine();
	            for(int j=0; j<m; j++)
	                a[i][j] = s.charAt(j) - '0';
	        }
	        
	        for(int i=0; i<n; i++)
	            for(int j=0; j<m; j++)
	                b[i][j] = a[i][m-1-j];
	        
	        for(int i=0; i<n; i++) {
	            for(int j=0; j<m; j++)
	                System.out.print(b[i][j]);
	            System.out.println();
	        }
	        } catch (Exception e) {
            
        }
    }
}
