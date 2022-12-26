import java.util.*;

public class p2744 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String text = sc.next();
        String result = "";
        
        for (int i=0; i<text.length(); i++) {
            char c = text.charAt(i);
            if (97 <= c && c <= 122) {
                result += (char)(c - 32);
            }
            if (65 <= c && c <= 90) {
                result += (char)(c + 32);
            }
        }
        System.out.println(result);
    }
}
