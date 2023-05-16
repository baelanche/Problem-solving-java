import java.util.*;

public class Main {
    
    public static int n;
    public static int m;
    public static int a[][];
    public static Map<Integer, Integer> selected;
    public static int answer = Integer.MAX_VALUE;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[500][500];
        selected = new HashMap<Integer, Integer>();
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        bf(0, 0);
        System.out.println(answer);
    }
    
    public static void bf(int cnt, int sum) {
        if (cnt == n) {
            answer = Math.min(answer, sum);
            return;
        }
        
        for (int i=0; i<m; i++) {
            if (selected.get(i) == null) {
                selected.put(i, i);
                bf(cnt + 1, sum + a[cnt][i]);
                selected.remove(i);
            }
        }
    }
}
