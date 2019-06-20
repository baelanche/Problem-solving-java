package boj.math.prob;

import java.util.Scanner;

public class p9506 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            StringBuilder sb = new StringBuilder();
            int n = sc.nextInt();
            if(n == -1) break;
            
            int sum = 0;
            for(int i=1; i<n; i++)
                if(n % i == 0) {
                    sb.append(i + " + ");
                    sum += i;
                }
            System.out.println(n == sum ? n + " = " + sb.toString().substring(0, sb.length()-3) : n + " is NOT perfect.");
        }
    }
}
