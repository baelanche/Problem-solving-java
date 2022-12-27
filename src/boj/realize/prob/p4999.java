import java.util.*;

public class p4999 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String j = sc.next();
        String k = sc.next();
        
        if (j.length() < k.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    }
}
