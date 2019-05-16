package boj.divide.prob;

import java.util.Scanner;

public class p2448 {

static char a[][];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int alpha = n/3 - 1;
        a = new char[n][n/3*5 + alpha];
        for(int i=0; i<a.length; i++)
            for(int j=0; j<a[0].length; j++)
                a[i][j] = ' ';
        
        drawStar(0, 0, n, a[0].length);
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[0].length; j++)
                sb.append(a[i][j]);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    
    public static void drawStar(int s, int e, int hlen, int wlen) {
        if(hlen < 3) return;
        
        int mid = (s + s + wlen)/2;
        int left = mid;
        int right = mid;
        int inleft = 0;
        int inright = 0;
        for(int i=e; i<hlen + e; i++) {
            if(i == e + hlen/2) {
                inleft = left;
                inright = right;
            } else if(i > hlen/2) {
                inleft++;
                inright--;
            }
            for(int j=left; j<=right; j++) {
                if(i >= e + hlen/2 && j > inleft && j < inright)
                    a[i][j] = ' ';
                else a[i][j] = '*';
            }
            left--;
            right++;
        }
        drawStar(s + hlen/2, e, hlen/2, wlen - hlen); //위
        drawStar(s, e + hlen/2, hlen/2, wlen - hlen); //왼쪽
        drawStar(s + wlen/2 + 1, e + hlen/2, hlen/2, wlen - hlen); //오른쪽
    }
}
