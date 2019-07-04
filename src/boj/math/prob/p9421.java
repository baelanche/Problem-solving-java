package boj.math.prob;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p9421 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        boolean prime[] = new boolean[1000001];
        for(int i=2; i<=1000000; i++)
            for(int j=i*2; j<=1000000; j+=i)
                prime[j] = true;
        
        for(int i=3; i<=n; i++) {
            if(!prime[i]) {
                Set<Integer> set = new HashSet<Integer>();
                String s = String.valueOf(i);
                boolean success = false;
                while(true) {
                    int sum = 0;
                    for(int j=0; j<s.length(); j++)
                        sum += Math.pow(s.charAt(j) - '0', 2);
                    if(sum == 1) {
                        success = true;
                        break;
                    }
                    if(!set.contains(sum)) {
                        set.add(sum);
                        s = String.valueOf(sum);
                    } else break;
                }
                if(success) System.out.println(i);
            }
        }
    }
}
