package boj.realize.prob;

import java.util.Arrays;
import java.util.Scanner;

public class p3486 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while(n-->0) {
            char a[] = sc.next().toCharArray();
            char b[] = sc.next().toCharArray();
            
            reverse(a);
            reverse(b);
            int x = charToint(a);
            int y = charToint(b);
            int sum = x + y;
            
            char c[] = String.valueOf(sum).toCharArray();
            for(int i=c.length-1; i>=0; i--) {
                if(c[i] == '0') c[i] = ' ';
                else break;
            }
            reverse(c);
            
            for(int i=0; i<c.length; i++)
                if(c[i] != ' ')
                    System.out.print(c[i]);
            System.out.println();
        }
    }
    
    public static int charToint(char a[]) {
        String temp = Arrays.toString(a).replaceAll(", ", "");
        temp = temp.substring(1, temp.length() - 1);
        return Integer.parseInt(temp);
    }
    
    public static void reverse(char a[]) {
        int s = 0;
        int e = a.length-1;
        while(s < e) {
            swap(a, s, e);
            s++;
            e--;
        }
    }
    
    public static void swap(char a[], int x, int y) {
        char temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
