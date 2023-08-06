package boj.collection.prob;

import java.util.Scanner;
import java.util.Stack;

public class p28278 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();
        while (n-->0) {
            int cmd = sc.nextInt();
            if (cmd == 1) {
                s.add(sc.nextInt());
            } else if (cmd == 2) {
                if (s.isEmpty()) {
                    sb.append(-1);
                } else {
                    sb.append(s.pop());
                }
                sb.append("\n");
            } else if (cmd == 3) {
                sb.append(s.size()).append("\n");
            } else if (cmd == 4) {
                if (s.isEmpty()) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
                sb.append("\n");
            } else {
                if (s.isEmpty()) {
                    sb.append(-1);
                } else {
                    sb.append(s.peek());
                }
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
