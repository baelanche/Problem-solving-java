package boj.tree.prob;

import java.util.ArrayList;
import java.util.Scanner;

public class p2250 {

	static int curr = 1;
    static ArrayList<Node> tree;
    static int min[];
    static int max[];
    static int levelRange;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        tree = new ArrayList<Node>();
        min = new int[n+1];
        max = new int[n+1];
        for(int i=0; i<=n; i++) {
            tree.add(new Node(i, -1, -1));
            min[i] = n;
            max[i] = 0;
        }
        
        for(int i=0; i<tree.size()-1; i++) {
            int node = sc.nextInt();
            int left = sc.nextInt();
            int right = sc.nextInt();
            tree.get(node).left = left;
            tree.get(node).right = right;
            if(left != -1) tree.get(left).parent = node;
            if(right != -1) tree.get(right).parent = node;
        }
        
        int root = 0;
        for(int i=1; i<tree.size(); i++) {
            if(tree.get(i).parent == -1) {
                root = i;
                break;
            }
        }
        
        inorder(root, 1);
        
        int al = 1;
        int aw = max[1] - min[1] + 1;
        for(int i=2; i<=levelRange; i++) {
            int width = max[i] - min[i] + 1;
            if(width > aw) {
                al = i;
                aw = width;
            }
        }
        System.out.println(al + " " + aw);
    }
    
    public static void inorder(int idx, int level) {
        Node root = tree.get(idx);
        if(levelRange < level) levelRange = level;
        if(root.left != -1)
            inorder(root.left, level + 1);
        
        min[level] = min(min[level], curr);
        max[level] = curr;
        curr++;
        
        if(root.right != -1)
            inorder(root.right, level + 1);
    }
    
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
    
    static class Node {
        int parent;
        int node;
        int left;
        int right;
        
        Node(int node, int left, int right) {
            this.parent = -1;
            this.node = node;
            this.left = left;
            this.right = right;
        }
    }
}
