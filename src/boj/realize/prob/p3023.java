package boj.realize.prob;

import java.util.Scanner;

public class p3023 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        char card[][] = new char[r][c];
        char card2[][] = new char[r][c];
        char card3[][] = new char[r][c];
        char card4[][] = new char[r][c];
        char full[][] = new char[r*2][c*2];
        
        for(int i=0; i<r; i++)
            card[i] = sc.next().toCharArray();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=0; i<r; i++) {
            for(int j=c; j>0; j--) {
                card2[i][c-j] = card[i][j-1];
            }
        }
        
        for(int i=r; i>0; i--) {
            for(int j=0; j<c; j++) {
                card3[r-i][j] = card[i-1][j];
            }
        }
        
        for(int i=r; i>0; i--) {
            for(int j=c; j>0; j--) {
                card4[r-i][c-j] = card[i-1][j-1];
            }
        }
        
        for(int i=0; i<r*2; i++) {
            for(int j=0; j<c*2; j++) {
                if(i<r && j<c)
                    full[i][j] = card[i][j];
                else if(i>=r && j<c)
                    full[i][j] = card3[i-r][j];
                else if(i<r && j>=c)
                    full[i][j] = card2[i][j-c];
                else
                    full[i][j] = card4[i-r][j-c];
            }
        }
        
        if(full[a-1][b-1] == '#')
            full[a-1][b-1] = '.';
        else full[a-1][b-1] = '#';
        
        for(int i=0; i<r*2; i++) {
            for(int j=0; j<c*2; j++) {
                System.out.print(full[i][j]);
            }
            System.out.println();
        }
        
        sc.close();
	}
}
