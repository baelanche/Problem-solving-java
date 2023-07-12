import java.util.*;

public class p10810 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        
        for (int t=0; t<m; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int f=i; f<=j; f++) {
                a[f-1] = k;
            }
        }
        
        Arrays.stream(a).forEach(x -> System.out.print(x + " "));
    }
}
