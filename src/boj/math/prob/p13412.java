package boj.math.prob;

import java.util.Scanner;

public class p13412 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int cnt = 0;
            int min = Integer.MAX_VALUE;
            for(int i=1; i<=n; i++) {
                if(n%i == 0) {
                    int x = i;
                    int y = n/i;
                    if(x >= min) break;
                    min = Math.min(min, y);
                    int g = gcd(x, y);
                    int l = lcm(x, y);
                    if(g == 1 && l == x*y) cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
    
    public static int gcd(int x, int y) {
        while(y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
    
    public static int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }
}
