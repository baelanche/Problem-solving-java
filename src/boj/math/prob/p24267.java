import java.util.*;

public class p24267 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextInt();
        
        long sum = 0;
        for (long i=n-2; i>=1; i--) {
            sum += i * (i + 1) / 2;
        }
        System.out.println(sum);
        System.out.println(3);
    }
}
