package boj.math.prob;

import java.util.Scanner;

public class p1024 {

	public static int sequenceSum(int n) {
        n = n*(n+1)/2;
        return n;
    }
    
    public static int compareSum(int x, int l) {
        int sum = 0;
        for(int i=0; i<l; i++) {
            sum += x+i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int l = sc.nextInt();
        
        for(int i=l; i<=100; i++) {
            int x = (n - sequenceSum(i-1))/i;
            
            if(n == compareSum(x, i) && x >= 0) {
                for(int j=0; j<i; j++) {
                    System.out.print(x+j+" ");
                }
                break;
            }
            if(i == 100 && n != compareSum(x, i))
                System.out.println(-1);
        }
    }
}
