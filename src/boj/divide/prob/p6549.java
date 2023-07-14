import java.util.Scanner;

public class p6549 {
    
    static long h[];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            h = new long[n];
            for(int i=0; i<n; i++)
                h[i] = sc.nextInt();
                
            sb.append(histogram(0, n) + "\n");
        }
        System.out.println(sb.toString());
    }
    
    public static long histogram(long s, long e) {
        if(s == e) return 0;
        if(s+1 == e) return h[(int)s];
        
        long mid = (s + e) / 2;
        long result = Math.max(histogram(s, mid), histogram(mid, e));
        
        long left = mid;
        long right = mid;
        long width = 1;
        long height = h[(int)mid];
        while(right - left + 1 < e - s) {
            long prev = left > s ? Math.min(height, h[(int)left-1]) : -1;
            long next = right < e-1 ? Math.min(height, h[(int)right+1]) : -1;
            if(prev <= next) {
                right++;
                height = next;
            } else {
                left--;
                height = prev;
            }
            result = Math.max(result, ++width * height);
        }
        return result;
    }
}
