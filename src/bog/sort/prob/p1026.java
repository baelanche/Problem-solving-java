package bog.sort.prob;

import java.util.Scanner;

public class p1026 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        for(int i=0; i<n; i++) b[i] = sc.nextInt();
        
        for(int i=1; i<n; i++) {
            for(int j=1; j<n; j++) {
                if(a[j-1] > a[j]) {
                    int tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        
        for(int i=1; i<n; i++) {
            for(int j=1; j<n; j++) {
                if(b[j-1] < b[j]) {
                    int tmp = b[j-1];
                    b[j-1] = b[j];
                    b[j] = tmp;
                }
            }
        }
        
        int sum = 0;
        for(int i=0; i<n; i++)
            sum += a[i]*b[i];
        
        System.out.println(sum);
    }
}
