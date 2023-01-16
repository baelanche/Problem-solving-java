package boj.realize.prob;

import java.util.Scanner;

public class p1264 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = sc.nextLine();
            if (s.equals("#")) {
                break;
            }
            int cnt = 0;
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                        s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb.toString());
    }
}
