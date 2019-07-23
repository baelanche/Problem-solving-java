package boj.collection.prob;

import java.util.Scanner;
import java.util.Stack;

public class p10804 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[21];
        Stack<Integer> s = new Stack();
        
        for(int i=1; i<=20; i++) arr[i] = i;
        
        for(int i=0; i<10; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            for(int j=a; j<=b; j++) s.add(arr[j]);
            for(int j=a; j<=b; j++) arr[j] = s.pop();
        }
        for(int i=1; i<=20; i++)
            System.out.print(arr[i] + " ");
    }
}
