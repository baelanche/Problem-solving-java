package boj.math.prob;

import java.util.Scanner;

public class p13413 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            char c1[] = sc.next().toCharArray();
            char c2[] = sc.next().toCharArray();
            
            int w = 0;
            int b = 0;
            for(int i=0; i<n; i++)
                if(c1[i] != c2[i]) {
                    if(c1[i] == 'W')
                        w++;
                    else
                        b++;
                }
            System.out.println(Math.min(w, b) + Math.abs(w - b));
        }
    }
}
