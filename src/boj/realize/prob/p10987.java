package boj.realize.prob;

import java.util.Scanner;

public class p10987 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] c = sc.next().toCharArray();
        
        int ans = 0;
        for(int i=0; i<c.length; i++)
            if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u')
                ans++;
        
        System.out.println(ans);
    }
}
