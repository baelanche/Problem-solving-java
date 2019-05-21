package boj.sort.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2751Quick {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = Integer.parseInt(br.readLine());
        
        quickSort(a, 0, n-1);
        
        for(int i=0; i<n; i++)
            bw.write(a[i] + "\n");
        
        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void quickSort(int a[], int left, int right) {
        if(left < right) {
            int p = partition(a, left, right);
            quickSort(a, left, p-1);
            quickSort(a, p+1, right);
        }
    }
    
    public static int partition(int a[], int left, int right) {
        int mid = (left + right)/2;
        swap(a, left, mid);
        
        int pivot = a[left];
        int i = left, j = right;
        
        while(i < j) {
            while(pivot < a[j]) {
                j--;
            }
            while(i < j && pivot >= a[i]) {
                i++;
            }
            swap(a, i, j);
        }
        a[left] = a[i];
        a[i] = pivot;
        return i;
    }
    
    public static void swap(int a[], int x, int y) {
        int temp = a[y];
        a[y] = a[x];
        a[x] = temp;
    }
}
