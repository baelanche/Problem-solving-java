import java.util.*;

public class p2559 {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int a[] = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        
        int index = 0;
        while (index + k <= n) {
            int sum = 0;
            for (int i=index; i<index + k; i++) {
                sum += a[i];
            }
            max = Math.max(max, sum);
            index++;
        }
        System.out.println(max);
    }
    
}
