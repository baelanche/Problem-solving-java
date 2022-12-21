import java.util.*;

public class p2740 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        m = sc.nextInt();
        int k = sc.nextInt();
        int b[][] = new int[m][k];
        for (int i=0; i<m; i++) {
            for (int j=0; j<k; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        
        int ans[][] = new int[n][k];
        for (int i=0; i<n; i++) {
            for (int j=0; j<k; j++) {
                
                int sum = 0;
                for (int x=0; x<m; x++) {
                    sum += a[i][x] * b[x][j];
                }
                ans[i][j] = sum;
            }
        }
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<k; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
