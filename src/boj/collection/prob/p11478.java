import java.util.*;

public class p11478 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String text = sc.next();
        Set<String> set = new HashSet<>();
        int len = 1;
        int s = 0;
        while (len <= text.length()) {
            String str = text.substring(s, s + len);
            if (text.length() <= ++s + len - 1) {
                len++;
                s = 0;
            }
            set.add(str);
        }
        System.out.println(set.size());
    }
}
