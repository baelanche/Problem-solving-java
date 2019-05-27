package boj.tree.prob;

import java.util.Scanner;

public class p1991 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        TreeSample t = new TreeSample(n);
        while(n-->0) {
            char[] c = sc.nextLine().toCharArray();
            t.setChildren(c[0]-65, c[2]-65, c[4]-65);
        }
        t.preorder(0);
        System.out.println();
        t.inorder(0);
        System.out.println();
        t.postorder(0);
    }
}

class TreeSample {
    
    int n;
    int parent[];
    int lc[], rc[];
    
    public TreeSample(int n) {
        this.n = n;
        parent = new int[n];
        lc = new int[n];
        rc = new int[n];
    }
    
    public void setChildren(int p, int l, int r) {
        if(l != -19) parent[l] = p;
        if(r != -19) parent[r] = p;
        if(l != -19) lc[p] = l;
        if(r != -19) rc[p] = r;
    }
    
    public void preorder(int root) {
        System.out.print((char)(root + 65));
        if(lc[root] != 0) preorder(lc[root]);
        if(rc[root] != 0) preorder(rc[root]);
    }
    
    public void inorder(int root) {
        if(lc[root] != 0) inorder(lc[root]);
        System.out.print((char)(root + 65));
        if(rc[root] != 0) inorder(rc[root]);
    }
    
    public void postorder(int root) {
        if(lc[root] != 0) postorder(lc[root]);
        if(rc[root] != 0) postorder(rc[root]);
        System.out.print((char)(root + 65));
    }
}