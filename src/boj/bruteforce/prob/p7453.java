package boj.bruteforce.prob;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p7453 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int temp[][] = new int[n][4];
        for(int i=0; i<n; i++) {
            temp[i][0] = sc.nextInt();
            temp[i][1] = sc.nextInt();
            temp[i][2] = sc.nextInt();
            temp[i][3] = sc.nextInt();
        }
        
        int a[] = new int[n*n];
        Map<Integer, Integer> b = new HashMap<Integer, Integer>();
        int idx = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                a[idx++] = temp[i][0] + temp[j][1];
                int sum = temp[i][2] + temp[j][3];
                if(b.containsKey(sum)) b.put(sum, b.get(sum) + 1);
                else b.put(sum, 1);
            }
        }
        
        long result = 0;
        for(int i=0; i<n*n; i++) {
            int key = -a[i];
            if(b.containsKey(key))
                result += b.get(key);
        }
        System.out.println(result);
    }
}
