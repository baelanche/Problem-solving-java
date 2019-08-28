package boj.realize.prob;

import java.util.Scanner;

public class p14656 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=1; i<=n; i++)
            if(sc.nextInt() != i)
                cnt++;
        
        System.out.println(cnt);
    }
}
