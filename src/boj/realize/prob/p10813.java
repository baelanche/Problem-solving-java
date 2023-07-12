import java.util.*;

public class p10813 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        
        for (int i=0; i<n; i++) {
            a[i] = i + 1;
        }
        
        for (int k=0; k<m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int temp = a[i-1];
            a[i-1] = a[j-1];
            a[j-1] = temp;
        }
        
        Arrays.stream(a).forEach(x -> System.out.print(x + " "));
    }
}
