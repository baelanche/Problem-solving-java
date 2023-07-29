import java.util.*;

public class p28352 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long dp[] = new long[18];
        dp[0] = 1;
        for (int i=1; i<=17; i++) {
            dp[i] = dp[i-1] * i;
        }
        System.out.println(dp[n]/60/60/24/7);
    }
}
