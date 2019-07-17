package boj.math.prob;

import java.util.Scanner;

public class p17294 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c[] = sc.next().toCharArray();
        
        if(c.length != 1) {
            int diff = c[0] - c[1];
            for(int i=2; i<c.length; i++) {
                if(c[i-1] - c[i] != diff) {
                    System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
                    return;
                }
            }
        }
        System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
    }
}
