import java.io.*;
import java.util.*;

public class p11444 {
    
    static long t[][] = {{1, 1}, {1, 0}};
    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long a[][] = {{1, 1}, {1, 0}};
        
        long ret[][] = divide(a, n);
        
        System.out.println(ret[1][0]);
    }
    
    public static long[][] divide(long l[][], long exp) {
        if (exp == 1) {
            return l;
        }

        long temp[][] = divide(l, exp/2);

        temp = mm(temp, temp);

        if (exp % 2 == 1) {
            temp = mm(temp, t);
        }
        return temp;
    }

    public static long[][] mm(long l[][], long r[][]) {
        long temp[][] = new long[2][2];

        for (int i=0; i<2; i++) {
            temp[0][0] = l[0][0] * r[0][0] + l[0][1] * r[1][0];
            temp[0][0] %= 1000000007;
            temp[0][1] = l[0][0] * r[0][1] + l[0][1] * r[1][1];
            temp[0][1] %= 1000000007;
            temp[1][0] = l[1][0] * r[0][0] + l[1][1] * r[1][0];
            temp[1][0] %= 1000000007;
            temp[1][1] = l[1][0] * r[0][1] + l[1][1] * r[1][1];
            temp[1][1] %= 1000000007;
        }
        return temp;
    }
}
