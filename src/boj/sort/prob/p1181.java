package boj.sort.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p1181 {

static String temp[];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String a[] = new String[n];
        temp = new String[n];
        
        for(int i=0; i<n; i++)
            a[i] = br.readLine();
        
        divide(a, 0, n-1);
        String prevStr = "";
        for(int i=0; i<a.length; i++) {
            if(prevStr.equals(a[i]))
                continue;
            bw.write(a[i] + "\n");
            prevStr = a[i];
        }
        bw.flush();
        bw.close();
    }
    
    public static int cmp(char c1[], char c2[]) {
        if(c1.length == c2.length) {
            for(int i=0; i<c1.length; i++) {
                if(c1[i] != c2[i]) return c2[i] - c1[i];
            }
            return 0;
        } else return c2.length - c1.length;
    }
    
    public static void divide(String a[], int left, int right) {
        int mid = (left + right)/2;
        if(left < right) {
            divide(a, left ,mid);
            divide(a, mid+1, right);
            merge(a, left, mid, right);
        }
    }
    
    public static void merge(String a[], int left, int mid, int right) {
        int leftFirst = left;
        int rightFirst = mid+1;
        
        int leftIndex = left;
        while(leftFirst <= mid && rightFirst <= right) {
            if(cmp(a[leftFirst].toCharArray(), a[rightFirst].toCharArray()) > 0)
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
