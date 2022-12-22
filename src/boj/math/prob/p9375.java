import java.util.*;

public class p9375 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            Map<String, Integer> map = new HashMap<>();
            while (n-->0) {
                sc.next();
                String ctg = sc.next();
                if (map.get(ctg) == null) {
                    map.put(ctg, 1);
                } else {
                    map.put(ctg, map.get(ctg) + 1);
                }
            }
            
            int ans = 1;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                int value = entry.getValue();
                ans *= value + 1;
            }
            System.out.println(ans - 1);
        }
    }
}
