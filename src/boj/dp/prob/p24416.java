import java.util.*;

public class p24416 {
    
    public static int cnt = 1;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        fib(n);
        System.out.println(cnt + " " + (n - 2));
    }
    
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            cnt++;
            return fib(n-1) + fib(n-2);
        }
    }
}
