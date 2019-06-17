package collection;

import java.util.Arrays;

public class UnionFind {
    
    int tree[];
    int size;
    
    UnionFind(int size) {
        tree = new int[size+1];
        this.size = size;
        
        Arrays.fill(tree, -1);
    }
    
    void set(int root, int child) {
        tree[child] = root;
    }
    
    int find(int n) {
        if(tree[n] < 0) return n;
        tree[n] = find(tree[n]);
        return tree[n];
    }
    
    void union(int a, int b) {
        a = find(a);
        b = find(b);
        if(a == b) return;
        tree[a] += tree[b];
        tree[b] = a;
    }
    
    public String toString() {
        String str = "[";
        for(int i=1; i<=size; i++)
            str += tree[i] + ", ";
        
        return str.substring(0, str.length()-2) + "]";
    }
    
    public static void main(String[] args) {
        UnionFind uf = new UnionFind(8);
        uf.set(2, 1);
        uf.set(2, 5);
        uf.set(5, 8);
        uf.set(8, 6);
        uf.set(3, 4);
        
        System.out.println(uf);
        System.out.println(uf.find(6));
        System.out.println(uf);
        uf.union(2, 3);
        System.out.println(uf);
    }
}