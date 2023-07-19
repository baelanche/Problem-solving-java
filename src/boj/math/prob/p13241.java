import java.util.Scanner;

public class p13241 {
    
    public static long gcd(long x, long y) {
        while(y != 0) {
            long tmp = y;
            y = x % y;
            x = tmp;
        }
        return x;
    }
    
    public static long lcm(long x, long y) {
        return x * y / gcd(x, y);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextInt();
        long b = sc.nextInt();
        System.out.println(lcm(a, b));
    }
}
