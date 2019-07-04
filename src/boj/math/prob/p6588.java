package boj.math.prob;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p6588 {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean prime[] = new boolean[1000001];
        for(int i=2; i<=1000000; i++)
            for(int j=i*2; j<=1000000; j+=i)
                prime[j] = true;
        
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;
            
            boolean b = false;
            for(int i=3; i<=n; i++) {
                if(!prime[i] && !prime[n-i]) {
                    System.out.println(n + " = " + i + " + " + (n-i));
                    b = true;
                    break;
                }
            }
            if(!b) System.out.println("Goldbach's conjecture is wrong.");
        }
    }
}
