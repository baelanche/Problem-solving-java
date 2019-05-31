package boj.sort.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p11004 {

static int temp[];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a[] = new int[n];
        temp = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            a[i] = Integer.parseInt(st.nextToken());
        
        divide(a, 0, n-1);
        
        bw.write(a[k-1] + "");
        bw.flush();
        bw.close();
    }
    
    public static void divide(int a[], int left, int right) {
        int mid = (left + right)/2;
        
        if(left < right) {
            divide(a, left, mid);
            divide(a, mid+1, right);
            merge(a, left, mid, right);
        }
    }
    
    public static void merge(int a[], int left, int mid, int right) {
        int leftFirst = left;
        int rightFirst = mid+1;
        
        int leftIndex = left;
        while(leftFirst <= mid && rightFirst <= right) {
            if(a[leftFirst] <= a[rightFirst])
                temp[leftIndex++] = a[leftFirst++];
            else
                temp[leftIndex++] = a[rightFirst++];
        }
        
        if(leftFirst > mid) {
            for(int i=rightFirst; i<=right; i++)
                temp[leftIndex++] = a[i];
        } else {
            for(int i=leftFirst; i<=mid; i++)
                temp[leftIndex++] = a[i];
        }
        for(int i=left; i<=right; i++)
            a[i] = temp[i];
    }
}
