package boj.sort.prob;

import java.util.*;

public class p18870 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        int b[] = Arrays.copyOf(a, n);
        Arrays.sort(b);
        
        HashMap m = new HashMap();
        int rank = 0;
        for(int i=0; i<n; i++) {
            if(!m.containsKey(b[i])) {
                m.put(b[i], rank);
                rank++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++)
            sb.append(m.get(a[i])).append(' ');
        System.out.println(sb);
    }
}
