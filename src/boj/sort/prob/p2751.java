package boj.sort.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2751 {

static int temp[];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n;
        n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        temp = new int[n];
        
        for(int i=0; i<n; i++)
            a[i] = Integer.parseInt(br.readLine());
        
        divide(a, 0, n-1);
        for(int i=0; i<n; i++) {
            bw.write(a[i] + "\n");
            bw.flush();
        }
        br.close();
        bw.close();
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
        for(int i=left; i<=right; i++)
            a[i] = temp[i];
    }
}
