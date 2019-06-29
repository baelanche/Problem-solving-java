package boj.collection.prob;

import java.util.Scanner;

import java.util.Stack;

public class p4949 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String str = sc.nextLine();
            if(str.equals(".")) break;
            
            Stack<Character> s = new Stack();
            
            boolean b = true;
            for(int i=0; i<str.length(); i++) {
                if(s.isEmpty() && (str.charAt(i) == ')' || str.charAt(i) == ']')) {
                    b = false;
                    break;
                }
                if(str.charAt(i) == '(') s.push('(');
                if(str.charAt(i) == ')') {
                    if(s.peek() == '(') s.pop();
                    else s.push(')');
                }
                if(str.charAt(i) == '[') s.push('[');
                if(str.charAt(i) == ']') {
                    if(s.peek() == '[') s.pop();
                    else s.push(']');
                }
            }
            if(s.isEmpty() && b) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
