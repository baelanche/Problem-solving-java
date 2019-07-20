package boj.realize.prob;

import java.util.Scanner;

public class p13420 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            char c[] = sc.nextLine().replaceAll(" ", "").toCharArray();
            String left = "";
            char mid;
            String right = "";
            String result = "";
            int k = 0;
            for(int i=0; true; i++) {
                if(i > 0 && (c[i] == '+' || c[i] == '-' || c[i] == '*' || c[i] == '/')) {
                    k = i+1;
                    mid = c[i];
                    break;
                } else left += c[i];
            }
            for(int i=k; true; i++) {
                if(c[i] == '=') {
                    k = i+1;
                    break;
                } else right += c[i];
            }
            for(int i=k; i<c.length; i++)
                result += c[i];
            
            long ans = 0;
            if(mid == '+') ans = Long.parseLong(left) + Long.parseLong(right);
            if(mid == '-') ans = Long.parseLong(left) - Long.parseLong(right);
            if(mid == '*') ans = Long.parseLong(left) * Long.parseLong(right);
            if(mid == '/') ans = Long.parseLong(left) / Long.parseLong(right);
            
            System.out.println(ans == Long.parseLong(result) ? "correct" : "wrong answer");
        }
    }
}
