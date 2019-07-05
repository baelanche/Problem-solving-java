package boj.twopointer.prob;

import java.util.ArrayList;
import java.util.Scanner;

public class p1644 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        boolean prime[] = new boolean[n+1];
        for(int i=2; i<=n; i++)
            for(int j=i*2; j<=n; j+=i)
                prime[j] = true;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=2; i<=n; i++)
            if(!prime[i]) list.add(i);
        
        int cnt = 0;
        int s = 0;
        int e = 0;
        int sum = 0;
        while(true) {
            if(sum >= n) sum -= list.get(s++);
            else if(e == list.size()) break;
            else sum += list.get(e++);
            if(sum == n) cnt++;
        }
        System.out.println(cnt);
    }
}
