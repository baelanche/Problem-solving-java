package boj.dp.prob;

import java.util.Scanner;

public class p9251 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = " " + sc.next();
        String b = " " + sc.next();
        int dp[][] = new int[b.length()][a.length()];
        
        for(int i=1; i<b.length(); i++) {
            for(int j=1; j<a.length(); j++) {
                if(b.charAt(i) == a.charAt(j)) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
            }
        }
        /*
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        */
        System.out.println(dp[b.length()-1][a.length()-1]);
    }
    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}
