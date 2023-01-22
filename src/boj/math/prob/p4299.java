import java.util.*;

public class p4299 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int sum = sc.nextInt();
        int sub = sc.nextInt();
        
        int a = (sum + sub) / 2;
        int b = (sum - sub) / 2;
        
        if (a + b == sum && a - b == sub && sum >= sub) {
            System.out.println(a + " " + b);
        } else {
            System.out.println(-1);
        }
    }
}
