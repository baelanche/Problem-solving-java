package boj.binary.prob;

import java.util.Scanner;

public class p1072 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long x = sc.nextInt();
        long y = sc.nextInt();
        int z = (int)(y * 100 / x);
        
        if(z >= 99) System.out.println(-1);
        else {
            int left = 0;
            int right = Integer.MAX_VALUE;
            while(left <= right) {
                int mid = (left + right)/2;
                if((int)((y+mid) *100 / (x+mid)) > z) right = mid - 1;
                else left = mid + 1;
            }
            System.out.println(left);
        }
    }
}
