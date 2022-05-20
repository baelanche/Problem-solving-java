package boj.tree.prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5639 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Tree tree = new Tree();
		for(int i=0; i<10000; i++) {
			String s = br.readLine();
			if (s == null) break;
			
			int value = Integer.parseInt(s);
			tree.addNode(value);
			
		}
	}
}

class Tree {
	
	class Node {
		int value;
		Node left;
		Node right;
		
		void left(Node node) {
			left = node;
		}
		
		void right(Node node) {
			right = node;
		}
	}
	
	void addNode(int value) {
		Node node = new Node();
		node.value = value;
	}
	
	public void preOrder(Node node) {
		if(node == null) return;
		
		//
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void postOrder(Node node) {
		if(node == null) return;
		
		postOrder(node.left);
		postOrder(node.right);
		//
	}
}