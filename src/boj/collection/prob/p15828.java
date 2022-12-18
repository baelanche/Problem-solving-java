import java.util.*;

public class p15828 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        while (true) {
            int k = sc.nextInt();
            if (k == -1) {
                break;
            } else if (k == 0) {
                q.poll();
            } else {
                if (q.size() < n) {
                    q.add(k);
                }
            }
        }
        int cnt = 0;
        while (!q.isEmpty()) {
            cnt++;
            sb.append(q.poll()).append(" ");
        }
        if (cnt == 0) {
            System.out.println("empty");
        } else {
            System.out.println(sb.toString());
        }
    }
    
}
