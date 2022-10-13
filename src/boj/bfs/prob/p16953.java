import java.util.*;

public class p16953 {

    public static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        bfs(a, b);
        
        System.out.println(min == Integer.MAX_VALUE ? "-1" : min);
    }

    public static void bfs(int a, int b) {
        Stack<Node> s = new Stack<Node>();
        
        s.add(new Node(a, b, 1));
        while (!s.isEmpty()) {
            Node top = s.pop();
            if (top.target == top.source) {
                min = Math.min(min, top.cnt);
            } else if (top.target < top.source) {
                continue;
            }
            s.add(new Node(top.source * 2, top.target, top.cnt + 1));
            String source = top.source + "1";
            s.add(new Node(Long.parseLong(source), top.target, top.cnt + 1));
        }
    }
}

class Node {
    long source;
    int target;
    int cnt;
    
    Node(long source, int target, int cnt) {
        this.source = source;
        this.target = target;
        this.cnt = cnt;
    }
}
