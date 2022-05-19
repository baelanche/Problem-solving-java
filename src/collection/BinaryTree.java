package collection;

public class BinaryTree {

	int size = 0;
	
	class Node {
		Object data;
		Node left;
		Node right;
		
		public Node(Object data) {
			this.data = data;
			left = null;
			right = null;
		}
		
		public void addLeft(Node node) {
			left = node;
			size++;
		}
		
		public void addRight(Node node) {
			right = node;
			size++;
		}
		
		public void deleteLeft() {
			left = null;
			size--;
		}
		
		public void deleteRight() {
			right = null;
			size--;
		}
	}
	
	public Node addNode(Object data) {
		Node node = new Node(data);
		return node;
	}
	
	public void preOrder(Node node) {
		if(node == null) return;
		
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void inOrder(Node node) {
		if(node == null) return;
		
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}

	public void postOrder(Node node) {
		if(node == null) return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		// Ʈ�� ����
		
		// ��� ����
		Node node1 = tree.addNode(1);
		Node node2 = tree.addNode(2);
		Node node3 = tree.addNode(3);
		Node node4 = tree.addNode(4);
		Node node5 = tree.addNode(5);
		Node node6 = tree.addNode(6);
		Node node7 = tree.addNode(7);
		
		// Ʈ�� ������� ����
		/*  Ʈ�� ���       
		 *        1
		 *     2     3
		 *   4  5  6   7
		 */
		node1.addLeft(node2);
		node1.addRight(node3);
		node2.addLeft(node4);
		node2.addRight(node5);
		node3.addLeft(node6);
		node3.addRight(node7);
		
		// ��ȸ
		tree.preOrder(node1);
		System.out.println();
		tree.inOrder(node1);
		System.out.println();
		tree.postOrder(node1);
		System.out.println();
		
		// ����
		node2.deleteLeft();
		node3.deleteRight();
		/* ���� ���� Ʈ�� ���
		 *        1
		 *     2     3
		 *      5  6   
		 */
		
		// ��ȸ
		System.out.println();
		tree.preOrder(node1);
		System.out.println();
		tree.inOrder(node1);
		System.out.println();
		tree.postOrder(node1);
		System.out.println();
	}
}
