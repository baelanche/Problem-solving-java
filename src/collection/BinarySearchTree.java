package collection;

public class BinarySearchTree {

	class Node {
		int data;
		Node left;
		Node right;
		
		Node(int data) {
			this.data = data;
		}
	}
	
	public Node root;
	
	public Node insertNode(Node node, int data) {
		if(node == null) return new Node(data);
		
		if(data < node.data) {
			node.left = insertNode(node.left, data);
		} else if(data > node.data) {
			node.right = insertNode(node.right, data);
		}
		
		return node;
	}
	
	public Node deleteNode(Node root, int data) {
		if(root == null) return root;
		
		if(data < root.data) {
			root.left = deleteNode(root.left, data);
		} else if(data > root.data) {
			root.right = deleteNode(root.right, data);
		} else {
			if(root.left == null) return root.right;
			else if(root.right == null) return root.left;
			
			Node temp = minValueNode(root.right);
			root.data = temp.data;
			root.right = deleteNode(root.right, temp.data);
		}
		return root;
	}
	
	public Node minValueNode(Node node) {
		Node currentNode = node;
		while(currentNode.left != null)
			currentNode = currentNode.left;
		
		return currentNode;
	}
	
	public static Node circularSearch(Node node, int key) {
		if(node == null) return null;
		
		if(key == node.data) {
			return node;
		} else if(key < node.data) {
			return circularSearch(node.left, key);
		} else {
			return circularSearch(node.right, key);
		}
	}
	
	public static Node repetitiveSearch(Node node, int key) {
		while(node != null) {
			if(key == node.data) {
				return node;
			} else if(key < node.data) {
				node = node.left;
			} else {
				node = node.right;
			}
		}
		return null;
	}
	
	public void preOrder(Node node) {
		if(node != null) {
			System.out.println(node.data);
			if(node.left != null) preOrder(node.left);
			if(node.right != null) preOrder(node.right);
		}
	}
	
	public void inOrder(Node node) {
		if(node != null) {
			if(node.left != null) inOrder(node.left);
			System.out.println(node.data);
			if(node.right != null) inOrder(node.right);
		}
	}
	
	public void postOrder(Node node) {
		if(node != null) {
			if(node.left != null) postOrder(node.left);
			if(node.right != null) postOrder(node.right);
			System.out.println(node.data);
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		int nodes[] = {50,30,24,5,28,45,98,52,60};
		for(int i=0; i<9; i++) {
			if(circularSearch(tree.root, nodes[i]) == null) {
				tree.root = tree.insertNode(tree.root, nodes[i]);
			}
		}
		
		tree.postOrder(tree.root);
	}
}
