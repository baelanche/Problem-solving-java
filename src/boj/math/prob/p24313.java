import java.util.*;

public class p24313 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        
       if (a * n + b <= c * n && a <= c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
