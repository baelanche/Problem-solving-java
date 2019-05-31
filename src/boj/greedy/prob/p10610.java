package boj.greedy.prob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p10610 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c[] = sc.next().toCharArray();
        Integer a[] = new Integer[c.length];
        for(int i=0; i<a.length; i++)
            a[i] = c[i] - '0';
        
        boolean zero = false;
        int sum = 0;
        for(int i=0; i<c.length; i++) {
            sum += c[i] - '0';
            if(c[i] - '0' == 0) zero = true;
        }
        
        Arrays.sort(a, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        
        if(sum % 3 == 0 && zero) {
            for(int i=0; i<a.length; i++)
                System.out.print(a[i]);
        } else System.out.println(-1);
    }
}
