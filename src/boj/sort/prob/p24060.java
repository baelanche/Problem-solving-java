import java.util.*;

public class p24060 {
    
    public static int k;
    public static int temp[];
    public static int cnt = 0;
    public static int result = -1;
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      k = sc.nextInt();
      int a[] = new int[n];
      temp = new int[n];
      for (int i=0; i<n; i++) {
          a[i] = sc.nextInt();
      }
      
      divide(a, 0, n - 1);
      System.out.println(result);
    }
    
    public static void divide(int a[], int left, int right) {
        if(left < right) {
            int mid = (left + right)/2;
            divide(a, left, mid);
            divide(a, mid+1, right);
            merge(a, left, mid, right);
        }
    }
    
    public static void merge(int a[], int left, int mid, int right) {
        int leftFirst = left;
        int rightFirst = mid+1;
        
        int leftSeq = left;
        while(leftFirst <= mid && rightFirst <= right) {
            if(a[leftFirst] <= a[rightFirst])
                temp[leftSeq++] = a[leftFirst++];
            else
                temp[leftSeq++] = a[rightFirst++];
        }
        if(leftFirst > mid) {
            for(int i=rightFirst; i<=right; i++)
                temp[leftSeq++] = a[i];
        } else {
            for(int i=leftFirst; i<=mid; i++)
                temp[leftSeq++] = a[i];
        }
        for(int i=left; i<=right; i++) {
            a[i] = temp[i];
            if (++cnt == k) {
                result = a[i];
            }
        }
    }
}
