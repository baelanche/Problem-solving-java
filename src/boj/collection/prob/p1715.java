package boj.collection.prob;

import java.util.Scanner;

public class p1715 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        MinHeap2 h = new MinHeap2(100001);
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
            h.insert(sc.nextInt());
        
        int cnt = 0;
        int sum = 0;
        int separate = 0;
        if(h.size == 1) sum = 0;
        else {
            while(!h.isEmpty()) {
                separate += h.top();
                cnt++;
                sum += h.delete();
                if(cnt == 2) {
                    h.insert(separate);
                    if(h.size == 1) break;
                    separate = 0;
                    cnt = 0;
                }
            }
        }
        
        System.out.println(sum);
    }
}

class MinHeap2 {
    
    int heap[];
    int size;
    
    public MinHeap2(int size) {
        heap = new int[size];
    }
    
    public void insert(int n) {
        heap[++size] = n;
        for(int i=size; i>1; i/=2) {
            if(heap[i/2] > heap[i])
                swap(i/2, i);
            else break;
        }
    }
    
    public int delete() {
        if(size == 0) return 0;
        
        int root = heap[1];
        heap[1] = heap[size];
        size--;
        
        for(int i=1; i*2<=size;) {
            if(heap[i] < heap[i*2] && heap[i] < heap[i*2+1]) break;
            else if(heap[i*2] < heap[i*2+1]) {
                swap(i, i*2);
                i = i*2;
            } else {
                swap(i, i*2+1);
                i = i*2+1;
            }
        }
        return root;
    }
    
    public int top() {
        return heap[1];
    }
    
    public boolean isEmpty() {
        if(size == 0) return true;
        else return false;
    }
    
    public void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
}