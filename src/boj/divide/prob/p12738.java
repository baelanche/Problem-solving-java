import java.io.*;
import java.util.*;

public class p12738 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        List<Integer> list = new ArrayList<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        list.add(a[0]);
        
        for (int i=1; i<n; i++) {
            int target = list.size();
            if (list.get(target - 1) < a[i]) {
                list.add(a[i]);
            } else {
                int lo = 0;
                int hi = target;
                while (lo < hi) {
                    int mid = (lo + hi) / 2;
                    if (list.get(mid) < a[i]) {
                        lo = mid + 1;
                    } else {
                        hi = mid;
                    }
                }
                list.set(lo, a[i]);
            }
        }
        
        System.out.println(list.size());
    }
}
