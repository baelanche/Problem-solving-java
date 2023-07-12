import java.util.*;

public class p2745 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        int b = sc.nextInt();
        
        int d = n.length() - 1;
        int ans = 0;
        for (int i=0; i<n.length(); i++) {
            int num = n.charAt(i) - 48 >= 10 ? n.charAt(i) - 55 : n.charAt(i) - 48;
            for (int j=0; j<d; j++) {
                num *= b;
            }
            d--;
            ans += num;
        }
        System.out.println(ans);
    }
}
