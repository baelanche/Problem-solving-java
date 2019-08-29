package boj.math.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p7510 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            long a[] = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(a);
            
            System.out.println("Scenario #" + i + ":");
            System.out.println(a[0]*a[0] + a[1]*a[1] == a[2]*a[2] ? "yes" : "no");
            System.out.println();
        }
    }
}
