package boj.divide.prob;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p1992 {

	static char[][] a;
    static Queue q = new LinkedList();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        a = new char[n][n];
        for(int i=0; i<n; i++)
            a[i] = sc.next().toCharArray();
        
        recursive(0, 0, n);
        while(!q.isEmpty()) System.out.print(q.poll());
    }
    
    public static void recursive(int r, int c, int len) {
        boolean f = true;
        char ch = a[r][c];
        for(int i=r; i<r+len; i++) {
            for(int j=c; j<c+len; j++) {
                if(ch != a[i][j]) {
                    f = false;
                    break;
                }
            }
        }
        
        if(!f) {
            q.offer("(");
            int m = len/2;
            for(int i=0; i<2; i++) {
                for(int j=0; j<2; j++) {
                    recursive(r + i*m, c + j*m, m);
                }
            }
            q.offer(")");
        } else q.offer(a[r][c]);
    }
}
