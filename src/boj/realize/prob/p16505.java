package boj.realize.prob;

import java.util.Scanner;

public class p16505 {

static char a[][];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int l = (int)Math.pow(2, n);
        a = new char[l][l];
        
        for(int i=0; i<l; i++)
            for(int j=0; j<l; j++)
                a[i][j] = ' ';
        
        a[0][0] = '*';
        int len = 1;
        while(n-->0) {
            drawStar(0, 0, len);
            len *= 2;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<l; i++) {
            for(int j=0; j<l-i; j++)
                sb.append(a[i][j]);
            sb.append("\n");
        }
        
        System.out.println(sb.toString().substring(0, sb.length()-1));
    }
    
    public static void drawStar(int x, int y, int len) {
        for(int i=x; i<x+len; i++)
            for(int j=y; j<y+len; j++) {
                a[i][j+len] = a[i][j];
                a[i+len][j] = a[i][j];
            }
    }
}
