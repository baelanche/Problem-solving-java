package boj.collection.prob;

import java.util.Scanner;

import java.util.Stack;

public class p10773 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        
        Stack<Integer> s = new Stack();
        
        while(k-->0) {
            int n = sc.nextInt();
            if(n != 0) s.push(n);
            else s.pop();
        }
        
        int sum = 0;
        while(!s.isEmpty()) {
            sum += s.pop();
        }
        System.out.println(sum);
    }
}
