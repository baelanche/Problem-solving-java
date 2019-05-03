package boj.collection.prob;

import java.util.Scanner;
import java.util.Stack;

public class p1918 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        char[] c = sc.next().toCharArray();
        
        for(int i=0; i<c.length; i++) {
            if(c[i] == '+' || c[i] == '-') {
                while(true) {
                    if(s.isEmpty() || s.peek() == (Object)'(') {
                        s.push(c[i]);
                        break;
                    } else System.out.print(s.pop());
                }
            } else if(c[i] == '*' || c[i] == '/') {
                while(true) {
                    if(s.isEmpty() || s.peek() == (Object)'(' || s.peek() == (Object)'+' || s.peek() == (Object)'-') {
                        s.push(c[i]);
                        break;
                    } else System.out.print(s.pop());
                }
            } else if(c[i] == '(') {
                s.push(c[i]);
            } else if(c[i] == ')') {
                while(!s.isEmpty()) {
                    if(s.peek() != (Object)'(') {
                        System.out.print(s.peek());
                    } else { s.pop(); break; }
                    s.pop();
                }
            } else System.out.print(c[i]);
        }
        while(!s.isEmpty()) System.out.print(s.pop());
    }
}
