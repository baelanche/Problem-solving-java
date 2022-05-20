package boj.tree.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5639 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Tree tree = new Tree();
		while(true) {
			String s = br.readLine();
			if(s == null || s.equals("")) break;
			int value = Integer.parseInt(s);
			tree.addNode(value);
		}
		tree.postOrder(tree.root);
	}
}

class Tree {
	
	class Node {
		int value;
		Node left;
		Node right;
	}
	
	Node root;
	
	void addNode(int value) {
		if (root == null) {
			root = new Node();
			root.value = value;
			return;
		}
		addNode(root, value);
	}
	
	void addNode(Node node, int value) {
		if(node == null) return;
		if(node.value < value) {
			if(node.right == null) {
				node.right = new Node();
				node.right.value = value;
			} else addNode(node.right, value);
		} else {
			if(node.left == null) {
				node.left = new Node();
				node.left.value = value;
			} else addNode(node.left, value);
		}
	}
	
	public void postOrder(Node node) {
		if(node == null) return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.value);
	}
}