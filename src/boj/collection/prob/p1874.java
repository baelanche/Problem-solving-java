package boj.collection.prob;

import java.util.*;

public class p1874 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<Integer>();
        
        int pos = 0;
        for(int i=1; i<=n; i++) {
            s.push(i);
            sb.append("+\n");
            while(!s.isEmpty() && s.peek() == a[pos]) {
                s.pop();
                pos++;
                sb.append("-\n");
            }
        }
        if(s.isEmpty())
            System.out.println(sb.toString());
        else
            System.out.println("NO");
    }
}
