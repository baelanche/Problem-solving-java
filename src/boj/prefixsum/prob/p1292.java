package boj.prefixsum.prob;

import java.util.Scanner;

public class p1292 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int psum[] = new int[1001];
        int num = 1;
        int seq = 0;
        for(int i=1; i<=1000; i++) {
            if(num == seq) {
                num++;
                seq = 0;
            }
            psum[i] = psum[i-1] + num;
            seq++;
        }
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(psum[b] - psum[a-1]);
    }
}
