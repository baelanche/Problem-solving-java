package boj.bruteforce.prob;

import java.util.Scanner;

public class p1018 {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] chess = new char[m][n];
        int min = 64;
        
        for(int i=0; i<m; i++) {
            chess[i] = sc.next().toCharArray();
        }
        
        int a=0, b=0;
        while(true) {
            int cnt = 0;
            int idx = 0;
            for(int i=a; i<8+a; i++) {
                for(int j=b; j<8+b; j++) {
                    if(idx%2 == 0 && i%2 == 0 && chess[i][j] != 'B')
                        cnt++;
                    if(idx%2 == 1 && i%2 == 0 && chess[i][j] != 'W')
                        cnt++;
                    if(idx%2 == 0 && i%2 == 1 && chess[i][j] != 'W')
                        cnt++;
                    if(idx%2 == 1 && i%2 == 1 && chess[i][j] != 'B')
                        cnt++;
                    idx++;
                }
            }
            idx = 0;
            cnt = (64 - cnt) < cnt ? 64 - cnt : cnt;
            min = cnt < min ? cnt : min;
            b++;
            if(b == n-7) {
                b = 0;
                a++;
            }
            if(a == m-7) break;
        }
        System.out.println(min);
    }
}
