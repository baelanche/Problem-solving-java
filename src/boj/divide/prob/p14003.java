import java.io.*;
import java.util.*;

public class p14003 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        int lis[] = new int[n];
        int index[] = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        lis[0] = a[0];
        index[0] = 1;
        int size = 1;
        for (int i=1; i<n; i++) {
            int target = a[i];
            if (lis[size-1] < target) {
                lis[size++] = target;
                index[i] = size;
            } else {
                int lo = 0;
                int hi = size;
                while (lo < hi) {
                    int mid = (lo + hi) / 2;
                    if (lis[mid] < target) {
                        lo = mid + 1;
                    } else {
                        hi = mid;
                    }
                }
                lis[lo] = target;
                index[i] = lo+1;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(size).append("\n");
        
        Stack<Integer> stack = new Stack<>();
        for (int i=n-1; i>=0; i--) {
            if (size == index[i]) {
                stack.push(a[i]);
                size--;
            }
        }
        
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }
        
        System.out.println(sb.toString());
    }
}
