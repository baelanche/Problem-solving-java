package boj.sort.prob;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p2751Heap {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Heap h = new Heap(n+1);
        for(int i=0; i<n; i++) {
            int k = Integer.parseInt(br.readLine());
            h.insert_min_heap(k);
        }
        for(int i=h.size-1; i>=0; i--)
            bw.write(h.delete_min_heap() + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}

class Heap {
    
    int heap[];
    int size;
    
    public Heap(int size) {
        heap = new int[size];
    }
    
    public void insert_min_heap(int n) {
        heap[++size] = n;
        for(int i=size; i>1; i/=2) {
            if(heap[i/2] > heap[i])
                swap(i/2, i);
            else break;
        }
    }
    
    public int delete_min_heap() {
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
    
    public void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
}