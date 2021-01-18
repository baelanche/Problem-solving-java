package kakao2019;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class psd2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.next().toCharArray();
		
		StringBuilder sb = new StringBuilder();
		Stack<Character> s = new Stack<Character>();
		Queue<Character> q = new LinkedList<Character>();
		int seq = 0;
		int seq2 = 0;
		for(int i=0; i<c.length; i++) {
			if(c[i] == '(') {
				s.push(c[i]);
				q.offer('(');
				seq2++;
				if(seq == seq2) {
					for(int j=0; j<seq; j++) {
						q.offer(')');
						s.pop();
					}
					seq = 0;
					seq2 = 0;
				}
			}
			
			if(c[i] == ')') {
				if(!s.isEmpty() && s.peek() == '(') {
					s.pop();
					q.offer(')');
					seq2 = 0;
				} else {
					seq++;
				}
			}
		}
		System.out.println(s);
		if(seq != 0) {
			while(seq-->0) {
				q.offer(')');
			}
		}
		
		while(!q.isEmpty()) {
			sb.append(q.poll());
		}
		System.out.println(sb);
	}
}
