package boj.greedy.prob;

import java.util.Scanner;

public class p4796 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int c = 1;
        while(true) {
            int l = sc.nextInt();
            int p = sc.nextInt();
            int v = sc.nextInt();
            if(l == 0 && p == 0 && v == 0) break;
            
            int use = 0;
            while(true) {
                if(v >= l) {
                    v -= l;
                    use += l;
                } else {
                    use += v;
                    v = 0;
                }
                v -= p - l;
                if(v <= 0) break;
            }
            System.out.println("Case " + c + ": " + use);
            c++;
        }
    }
}
