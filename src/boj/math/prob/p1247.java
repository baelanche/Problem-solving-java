import java.util.*;
import java.math.*;

public class p1247 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i<3; i++) {
            int n = sc.nextInt();
            BigInteger ret = new BigInteger("0");
            for (int j=0; j<n; j++) {
                BigInteger b = sc.nextBigInteger();
                ret = ret.add(b);
            }
            System.out.println(ret.compareTo(new BigInteger("0")) < 0 ? "-" : ret.compareTo(new BigInteger("0")) == 0 ? "0" : "+");
        }
        
    }
}
