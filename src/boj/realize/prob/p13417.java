package boj.realize.prob;

import java.util.Scanner;

public class p13417 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int idx = 0;
            String result = sc.next();
            for(int i=0; i<n-1; i++) {
                char c = sc.next().charAt(0);
                int k = idx;
                boolean s = true;
                while(k >= 0) {
                    if(result.charAt(k) >= c) {
                        k--;
                    } else {
                        s = false;
                        break;
                    }
                }
                
                if(s) {
                    result = c + result;
                    idx++;
                } else
                    result = result + c;
            }
            System.out.println(result);
        }
    }
}
