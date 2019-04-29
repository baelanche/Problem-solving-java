package boj.divide.prob;

import java.util.Scanner;

public class p1725 {

	static int h[];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        h = new int[n];
        for(int i=0; i<n; i++)
            h[i] = sc.nextInt();
        System.out.println(histogram(0, n));
    }
    
    public static int histogram(int s, int e) {
        if(s == e) return 0;
        if(s+1 == e) return h[s];
        
        int mid = (s + e) / 2;
        int result = max(histogram(s, mid), histogram(mid, e));
        
        int left = mid;
        int right = mid;
        int width = 1;
        int height = h[mid];
        while(right - left + 1 < e - s) {
            int prev = left > s ? min(height, h[left-1]) : -1;
            int next = right < e-1 ? min(height, h[right+1]) : -1;
            if(prev <= next) {
                right++;
                height = next;
            } else {
                left--;
                height = prev;
            }
            result = max(result, ++width * height);
        }
        return result;
    }
    
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
